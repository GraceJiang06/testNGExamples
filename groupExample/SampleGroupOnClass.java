package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test( groups = {"group on class"})
public class SampleGroupOnClass {
	@Test
	public void testGroupOnClass_1() {
		System.out.println("testGroupOnClass_1");
		Assert.assertTrue(true, "testGroupOnClass_1 pass");	
	}
	
	@Test
	public void testGroupOnClass_2() {
		System.out.println("testGroupOnClass_2");
		Assert.assertTrue(true, "testGroupOnClass_2 pass");	
	}
}
