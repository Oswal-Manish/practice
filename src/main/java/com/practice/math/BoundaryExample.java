package com.practice.math;

/*
 * An array of boolean values is divided into two sections: the left section consists of all false,
 * and the right section consists of all true. Find the boundary of the right section, i.e. the index
 * of the first true element. If there is no true element, return -1.
 */
public class BoundaryExample {
	public static void main(String[] args) {
		boolean arrBoolean[] = { false, false, false, false, true, true, true };
		System.out.println(findBoundary(arrBoolean));
	}

	public static int findBoundary(boolean[] arr) {
		// WRITE YOUR BRILLIANT CODE HERE
		int low, high, mid = 0;
		low = 0;
		high = arr.length - 1;
		int boundary = -1;
		while (low <= high) {
			mid = (low + high) / 2;
			if (arr[mid]) {
				boundary = mid;
				high = mid - 1;
			}
			else if(!arr[mid]) { // False move to right
				low = mid + 1;
			} 
		}
		return boundary;
	}
}
