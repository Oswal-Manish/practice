package com.practice.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * Find Input Number is Prime or Not 
 */
public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Please enter a number : ");
		Scanner scan = new Scanner(System.in);
		int inputNumber = scan.nextInt();
		//boolean isPrime = isPrimeNumber(inputNumber);
		System.out.println("Input Number "+ inputNumber + " is Prime : "+ printAllPrimeNumber(inputNumber));
	}

	private static boolean isPrimeNumber(int inputNumber) {
		if(inputNumber <= 1) {
			return false;
		}
		boolean isPrime = true;
		for(int i = 2; i < inputNumber ;i++) {
			if(inputNumber % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	
	private static List<Integer> printAllPrimeNumber(int inputNumber) {
		List<Integer> primeNumberList = new ArrayList<Integer>();
		for (int i = 2; i < inputNumber; i++) {
			if(isPrimeNumber(i)) {
				primeNumberList.add(i);
			}
		}
		return primeNumberList;
	}
}
