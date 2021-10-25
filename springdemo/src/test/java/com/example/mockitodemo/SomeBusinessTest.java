package com.example.mockitodemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeBusinessTest {

	@Test
	public void testGreatest() {
//		fail("Not yet implemented");
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(new DataServiceStub());
		int res = someBusinessImpl.getGreatest();
		assertEquals(15, res);
	}

}

class DataServiceStub implements DataService
{

	@Override
	public int[] retrieveAllData() {
		return new int[] {4,6,15};
	}
	
}
