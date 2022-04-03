package com.onebill.Stringproblems;

import java.util.Arrays;
import java.util.Scanner;

public class Pro4 {

	public static void main(String[] args) {

		System.out.println("Enter the string : ");
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();
		boolean s = true;
		if (s1.length == s2.length) {
			for (int i = 0; i < s1.length; i++) {
				if (Arrays.binarySearch(s1, s2[i]) >= 0) {
					continue;
				} else {
					s = false;
				}
			}
		} else {
			s = false;
		}
		if (s) {
			System.out.println("anagram satisfied");
		} else {
			System.out.println("anagram not satisfied");
		}
		scan.close();
	}

}
