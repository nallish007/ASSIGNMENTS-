package com.onebill.Stringproblems;

import java.util.Scanner;

public class Pro13 {

	public static void main(String[] args) {

		System.out.println("Enter the string : ");
		Scanner scan = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		StringBuilder str3 = new StringBuilder(str);
		str.append(scan.nextLine());
		String res = "";
		int start = 0;
		int end = 0;
		str.reverse();
		str.append(' ');
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ' || i == str.length() - 2) {
				end = i;
				res = str.substring(start, end);
				StringBuilder str2 = new StringBuilder(res);
				start = end;
				str2.reverse();
				str3.append(str2.substring(0));
				str3.append(' ');
			}

		}
		scan.close();
		System.out.println("resultant \n" + str3);
	}

}
