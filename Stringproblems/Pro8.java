package com.onebill.Stringproblems;

import java.util.Scanner;

public class Pro8 {

	public static void main(String[] args) {
		System.out.println("Enter the string : ");
		Scanner scan = new Scanner(System.in);
		StringBuffer str = new StringBuffer();
		str.append(scan.nextLine());
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				str.setCharAt(i, '@');
			}

		}
		System.out.println(str);
		scan.close();
	}

}
