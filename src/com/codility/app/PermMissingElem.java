package com.codility.app;

import java.util.HashSet;
import java.util.Set;

public class PermMissingElem {

	/**
	 * An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], 
	 * which means that exactly one element is missing. Your goal is to find that missing element.
	 * Write a function:
	 *  public int solution(int[] A); 
	 *  that, given an array A, returns the value of the missing element.
	 */
	
	public static void main(String[] args) {
		
		int[] A =  {1,7,3,5,4,2,9};
		System.out.println(solution(A));
	}

	public static int solution(int[] A)
	{
		if(A.length == 0)
			return -1;
		
		Set<Integer> missed = new HashSet<>();
		
		for(int i=0; i<A.length; i++)
		{
			missed.add(A[i]);
		}
		
		for(int i=1; 0<A.length; i++)
		{
			if(!missed.contains(i))
				return i;
		}	
		return -1;		
	}
}
