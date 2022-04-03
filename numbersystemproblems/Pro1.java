package com.onebill.numbersystemproblems;

import java.util.Scanner;

public class Pro1 {

	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		Scanner scan = new Scanner(System.in);
		int num= scan.nextInt();
		String str = Integer.toString(num);
		int n = new StringBuilder(str).reverse().toString().compareTo(str);
		if (n == 0) {
			System.out.println("The given number is a palindrome");

		} else {
			System.out.println("The given number is NOT  a palindrome");
		}
		scan.close();
	}

}
