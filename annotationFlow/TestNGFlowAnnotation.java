package com.testNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGFlowAnnotation {

	/**
	 * Annotation part
	 */
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("    beforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("    afterSuite");
	}

	@BeforeTest
	public void beforeTest1() {
		System.out.println("        beforeTest1");
	}

	@AfterTest
	public void afterTest1() {
		System.out.println("        afterTest1");
	}

	@BeforeClass
	public void beforeClass1() {
		System.out.println("            beforeClass1");
	}

	@AfterClass
	public void afterClass1() {
		System.out.println("            afterClass1");
	}

	@BeforeGroups(groups = {"group1"})
	public void beforeGroup1() {
		System.out.println("                beforeGroup1");
	}

	@AfterGroups(groups = {"group1"})
	public void afterGroup1() {
		System.out.println("                afterGroup1");
	}
	
	@BeforeGroups(groups = {"group2"})
	public void beforeGroup2() {
		System.out.println("                beforeGroup23");
	}

	@AfterGroups(groups = {"group2"})
	public void afterGroup2() {
		System.out.println("                afterGroup23");
	}
	@BeforeGroups(groups = {"group3"})
	public void beforeGroup3() {
		System.out.println("                beforeGroup23");
	}

	@AfterGroups(groups = {"group3"})
	public void afterGroup3() {
		System.out.println("                afterGroup23");
	}

	@BeforeMethod
	public void beforeMethod1() {
		System.out.println("                    beforeMethod1");
	}

	@AfterMethod
	public void afterMethod1() {
		System.out.println("                    afterMethod1");
	}

	/**
	 * test method part
	 */
	@Test(groups = "group1")
	public void test11() {
		System.out.println("                        test11");
		Assert.assertTrue(true, "test11 pass");
	}

	@Test(groups = "group2"/*, retryAnalyzer = TestNGListener.class*/)
	public void test13() {
		System.out.println("                        test13");
		//Assert.fail("test13 failed");
	}
	
	@Test(groups = "group1")
	public void test12() {
		System.out.println("                        test12");
		Assert.assertTrue(true, "test12 pass");
	}
	
	@Test(groups = "group3") // TODO bug! if, dependsOnMethods = "test15" with dependsOnMethods and group and								// intercepter
	public void test14() {
		System.out.println("                        test14");
		Assert.assertTrue(true, "test14 pass");
	}

	@Test(groups = "group3")
	public void test15() {
		System.out.println("                        test15");
		Assert.assertTrue(true, "test15 pass");
	}
}
