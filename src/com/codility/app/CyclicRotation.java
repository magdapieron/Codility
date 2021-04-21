package com.codility.app;

public class CyclicRotation {

	/**
	 * An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, 
	 * and the last element of the array is moved to the first place. For example, the rotation of array 
	 * A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).
	 * The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.
	 * Write a function:
	 * public int[] solution(int[] A, int K);
	 * that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.
	 */
	
	public static void main(String[] args) {
		int[] A = {1,2,3,4,5};
		
		int[] result2 = solution(A, 2);
		for(int r : result2) 
		{
			System.out.println(r);
		}
	}
	
	public static int[] solution(int[] A, int K)
	{
		int N = A.length;
		int[] B = new int[N];
		for(int i=0; i<N; i++)
		{
			int newIndex = (i+K)%N;
			B[newIndex] = A[i];
		}
		A = B;
		return A;
	}
}
