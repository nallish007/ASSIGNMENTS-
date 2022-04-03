package com.onebill.Stringproblems;

import java.util.Arrays;
import java.util.Scanner;

public class Pro2 {

	public static void main(String[] args) {

		System.out.println("Enter the string : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char[] v= {'a','e','i','o','u','A','E','O','I','U'};
		char a[] = str.toCharArray();
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (Arrays.binarySearch(v, str.charAt(i))>=0 ) {
				count++;
			}
		}
		System.out.println("punctuation count : "+count);
		scan.close();
	
	}
}
