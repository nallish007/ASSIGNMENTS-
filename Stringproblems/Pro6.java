package com.onebill.Stringproblems;

import java.util.Scanner;

public class Pro6 {

	public static void main(String[] args) {

		System.out.println("Enter the string : ");
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		int i = 0;
		String[] s2 = new String[50];
		for (int j = 0; i < s1.length(); i++) {
			s2[i] = s1.substring(j, j + i+1);
		}
		for (int j = s1.length(), l = 0; l < s1.length(); i++) {
			s2[i] = s1.substring(l, j );
			l++;
		}
		System.out.println("the substrings of the string : ");
		for (int j = 0; j < i; j++) {
			System.out.println(s2[j]);
		}
		scan.close();
	}
}
