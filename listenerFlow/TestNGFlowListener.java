package com.testNG;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.IAnnotationTransformer;
import org.testng.IExecutionListener;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.IRetryAnalyzer;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class TestNGFlowListener implements IExecutionListener, IInvokedMethodListener, ITestListener,
		IAnnotationTransformer, IMethodInterceptor, ISuiteListener/*, IRetryAnalyzer*/ {

	@Override
	public void onExecutionStart() {
		System.out.println("onExecutionStart");
	}

	@Override
	public void onExecutionFinish() {
		System.out.println("onExecutionFinish");
	}

	@Override
	public void onStart(ISuite suite) {
		System.out.println("    onStart(ISuite suite)");
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("    onFinish(ISuite suite)");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("          onStart(ITestContext context)");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("           onFinish(ITestContext context)");
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("                    onTestStart(ITestResult result)");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("                    onTestSuccess(ITestResult result)");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("                    onTestFailure(ITestResult result)");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("                    onTestSkipped(ITestResult result)");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("                    onTestFailedButWithinSuccessPercentage(ITestResult result)");
	}

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("                        beforeInvocation(IInvokedMethod method, ITestResult testResult)");
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("                        afterInvocation(IInvokedMethod method, ITestResult testResult)");
	}

	@Override
	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
		System.out.println("              intercept");
		List<IMethodInstance> result = new ArrayList<IMethodInstance>();
		for (IMethodInstance m : methods) {
			Set<String> groups = new HashSet<String>();
			for (String group : m.getMethod().getGroups()) {
				groups.add(group);
			}
			if (groups.contains("group3")) {
				result.add(0, m);
			} else {
				result.add(m);
			}
		}
		return result;
	}

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		System.out.println("    transform for " + testMethod.getName());
		if ("testFlow".equals(testMethod.getName())) {
			annotation.setInvocationCount(2);
		}
	}

}
