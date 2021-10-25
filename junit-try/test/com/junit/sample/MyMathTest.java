package com.junit.sample;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {

	@Before
	public void before()
	{
		System.out.println("Before");
	}
	
	@After
	public void after()
	{
		System.out.println("After");
	}
	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("Before class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After class");
	}
	
	@Test
	public void sum3NumsTest() {
//		fail("Not yet implemented");
		MyMath myMath = new MyMath();
		int res = myMath.sum(new int[] {1,2,3});
		System.out.println("sum3NumsTest");
		assertEquals(6, res);
	}

}
