package com.onebill.Stringproblems;

import java.util.Scanner;

public class Pro10 {

	public static void main(String[] args) {
		System.out.println("Enter the string : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int n = new StringBuilder(str).reverse().toString().compareTo(str);
		if (n == 0) {
			System.out.println("The given string is a palindrome");

		} else {
			System.out.println("The given string is NOT  a palindrome");
		}
		scan.close();

	}

}
