package com.example.mockitodemo;

public class SomeBusinessImpl {
	private DataService dataService;
	
	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int getGreatest()
	{
		int []data = dataService.retrieveAllData();
		int greatest = Integer.MIN_VALUE;
		for(int val : data)
		{
			if(val>greatest)
			{
				greatest=val;
			}
		}
		return greatest;
	}
}