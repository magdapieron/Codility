package com.codility.app;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {
	
	/**
	 * A non-empty array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array 
	 * can be paired with another element that has the same value, except for one element that is left unpaired.
	 * For example, in array A such that:
	 * A[0] = 9  A[1] = 3  A[2] = 9
	 * A[3] = 3  A[4] = 9  A[5] = 7
	 * A[6] = 9
	 * the elements at indexes 0 and 2 have value 9,
	 * the elements at indexes 1 and 3 have value 3,
	 * the elements at indexes 4 and 6 have value 9,
	 * the element at index 5 has value 7 and is unpaired.
	 * Write a function:
	 * public int solution(int[] A);
	 * that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.
	 */

	public static void main(String[] args) {
		
		int[] A = {1,2,1,2,5,6,7,6,8,7,8};
		
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A)
	{	
		if(A.length == 0)
			return -1;
		
		Set<Integer> elements = new HashSet<>();
		for(int element : A)
		{
			if(elements.contains(element))
				elements.remove(element);
			else
				elements.add(element);
		}
		return elements.iterator().next();		
		
		
//		or that solution	
		
		
//		if(A.length == 0)
//			return -1;
		
//		int elements = 0;
//		
//		for(int element : A)
//			elements ^= element;
//		
//		return elements;
	}
}
