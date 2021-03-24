package com.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTest {

	
	
	@Test
	public void test1() {
		
		Assert.assertTrue(false);
		System.out.println("this is failed");
	}
}
