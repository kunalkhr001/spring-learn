package com.example.springdemo.cdi;

public class SomeCdiBusiness {
	
	SomeCdiDao someCdiDao;
	
	public SomeCdiDao getSomeCdiDao() {
		return someCdiDao;
	}

	public void setSomeCdiDao(SomeCdiDao someCdiDao) {
		this.someCdiDao = someCdiDao;
	}

	public int findGreatest()
	{
		int greatest = Integer.MIN_VALUE;
		int []data = someCdiDao.getData();
		for(int val:data)
		{
			if(val>greatest)
			{
				greatest = val;
			}
		}
		return greatest;
	}
}
