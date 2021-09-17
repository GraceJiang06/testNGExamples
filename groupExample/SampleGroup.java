package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SampleGroup {

	@Test(groups = {"linux","functionTest"})
	public void testFunction_1() {
		System.out.println("functionTest_linux");
		Assert.assertTrue(true, "functionTest_linux pass");	
	}
	
	@Test(groups = {"windows","functionTest"})
	public void testFunction_2() {
		System.out.println("functionTest_windows");
		Assert.assertTrue(true, "functionTest_windows pass");	
	}
	
	@Test(groups = {"linux","performanceTest"})
	public void testPerformance_1() {
		System.out.println("performanceTest_linux");
		Assert.assertTrue(true, "performanceTest_linux pass");	
	}
	
	@Test(groups = {"windows","performanceTest"})
	public void testPerformance_2() {
		System.out.println("performanceTest_windows");
		Assert.assertTrue(true, "performanceTest_windows pass");	
	}
	
	@Test(groups = {"linux","regressionTest"})
	public void testRegression_1() {
		System.out.println("regressionTest_linux");
		Assert.assertTrue(true, "regressionTest_linux pass");	
	}
	
	@Test(groups = {"windows","regressionTest"})
	public void testRegression_2() {
		System.out.println("regressionTest_windows");
		Assert.assertTrue(true, "regressionTest_windows pass");	
	}
	
	@Test(groups = {"solaris"})
	public void test_1() {
		System.out.println("solaris_test1");
		Assert.assertTrue(true, "solaris_test1 pass");	
	}
	@Test(groups = {"solaris"})
	public void test_2() {
		System.out.println("solaris_test2");
		Assert.assertTrue(true, "solaris_test2 pass");	
	}
}
