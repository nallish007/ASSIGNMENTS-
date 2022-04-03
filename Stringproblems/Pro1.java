package com.onebill.Stringproblems;

import java.util.Scanner;

public class Pro1 {

	public static void main(String[] args) {

		System.out.println("Enter the string : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		char a[] = str.toCharArray();
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (((int) a[i] > 31 && (int) a[i] < 48) || ((int) (a[i]) > 57 && (int) a[i] < 65)
					|| ((int) (a[i]) > 60 && (int) a[i] < 97) || ((int) (a[i]) > 122 && (int) a[i] < 127)) {
				count++;
			}
		}
		System.out.println("punctuation count"+count);
		scan.close();
	}

}
