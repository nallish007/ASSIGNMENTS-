package com.onebill.assignment3;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the number of inputs ");
		int n=scan.nextInt();
		System.out.println("Enter the numbers : ");
		for (int i=0;i<n;i++) {
			sum+=scan.nextInt();
		}
		System.out.println("Sum of the given numbers : "+sum);
		scan.close();
	}
}
