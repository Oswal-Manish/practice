package com.practice.math;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		Arrays.stream(arr).forEach(System.out::println);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number to search in array : ");
//		System.out.println(binarySearchRecursive(arr, scan.nextInt(), 0, arr.length));
		System.out.println(binarySearch(arr, scan.nextInt()));
		scan.close();
	}

	public static int binarySearchRecursive(int[] arr, int target, int low, int high) {

		if (low >= high) {
			return -1;
		}
		int mid = (high + low) / 2;
		if (arr[mid] == target) {
			return mid;
		} else if (arr[mid] > target) {
			high = mid - 1;
			return binarySearchRecursive(arr, target, low, high);
		} else {
			low = mid + 1;
			return binarySearchRecursive(arr, target, low, high);
		}
	}

	public static int binarySearch(int[] arr, int target) {
		int high = arr.length-1;
		int low = 0;
		int mid;
		while (low <= high) {
			mid = (high + low) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

}
