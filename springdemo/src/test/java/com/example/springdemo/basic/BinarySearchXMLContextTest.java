package com.example.springdemo.basic;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.springdemo.SpringdemoBasicApplication;
import com.example.springdemo.SpringdemoScopeApplication;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/testContext.xml")
public class BinarySearchXMLContextTest {
	
	@Autowired
	BinarySearchImpl binarySearch;

	@Test
	public void test() {
		int res = binarySearch.binarySearch(new int[] {5}, 1);
		assertEquals(1, res);
	}

}
