package com.codility.app;

import java.util.ArrayList;
import java.util.List;

public class BinaryGap {

	/**
	 * Write a function:
	 * public int solution(int N);
	 * that, given a positive integer N, returns the length of its longest binary gap. 
	 * The function should return 0 if N doesn't contain a binary gap.
	 */
	
	public static void main(String[] args) {

		System.out.println(solution(529));
	}
	
	public static int solution(int N)
	{		
		List<Integer> binaryNotation =  binaryNotation(N);
		int biggestGap = 0;
		int gap = 0;
		boolean wasOne = false;
		
		for(int number : binaryNotation)
		{
			if(!wasOne)
			{
				if(number == 1)
					wasOne = true;
			}
			else
			{
				if(number == 1)
				{
					if(gap > biggestGap)
						biggestGap = gap;
					gap = 0;
				}
				else
					gap++;
			}
		}		
		return biggestGap;
	}
	
	private static List<Integer> binaryNotation(int N)
	{
		List<Integer> binaryNotation = new ArrayList<>();
		
		while(N != 0)
		{
			binaryNotation.add(N%2);
			N /= 2;
		}
		return binaryNotation;
	}
}
