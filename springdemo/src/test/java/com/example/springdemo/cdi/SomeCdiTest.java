package com.example.springdemo.cdi;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.springdemo.SpringdemoBasicApplication;
import com.example.springdemo.SpringdemoScopeApplication;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringdemoBasicApplication.class)
public class SomeCdiTest {
	
	@Autowired
	SomeCdiBusiness business;

	@Test
	public void test() {
		int res = business.findGreatest();
		assertEquals(3, res);
	}

}
