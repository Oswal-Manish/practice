package com.practice.math;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		System.out.println("Please enter a number 1 : ");
		Scanner scan = new Scanner(System.in);
		int inputNumber1 = scan.nextInt();
		
		System.out.println("Please enter a number 2 : ");
		scan = new Scanner(System.in);
		int inputNumber2 = scan.nextInt();
		//System.out.println(gcd(inputNumber1,inputNumber2));
		System.out.println(gcdRecursive(inputNumber1,inputNumber2));
		scan.close();
	}
	
	public static int gcd(int no1, int no2) {
		int gcd = 1;
		for (int i = 2; i <= no1 || i <= no2 ; ) {
			if ((no1 % i == 0) && (no2 % i == 0)) {
				no1 = no1 / i;
				no2 = no2 / i;
				gcd = gcd * i;
			}else {
				i++;
			}
		}
		return gcd;
	}
	
	/*
	 * Using recursion 
	 */
	public static int gcdRecursive(int no1, int no2) {
		if (no1 == 0) {
			return no2;
		}
		return gcdRecursive(no2 % no1, no1);
	}
}
