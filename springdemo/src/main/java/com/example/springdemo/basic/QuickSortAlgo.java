package com.example.springdemo.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgo implements SortAlgo {
	public int[] sort(int []numbers)
	{
		return numbers;
	}
}
