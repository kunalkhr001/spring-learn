package com.example.spring.aop.data;

import org.springframework.stereotype.Repository;

import com.example.spring.aop.aspect.TrackTime;

@Repository
public class Dao1 {
	@TrackTime
	public String retrieveSomething()
	{
		return "Dao1";
	}
}
