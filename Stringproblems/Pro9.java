package com.onebill.Stringproblems;

import java.util.Scanner;

public class Pro9 {

	public static void main(String[] args) {

		System.out.println("Enter the string : ");
		Scanner scan = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		str.append(scan.nextLine());
		for (int i = 0; i < str.length(); i++) {
			if (((int) str.charAt(i) >= 97 && (int) str.charAt(i) <= 122)) {
				str.setCharAt(i,(char)((int) str.charAt(i) - 32));
				continue;
			}
			if (((int) str.charAt(i) >= 65 && (int) str.charAt(i) <= 90)) {
				str.setCharAt(i,(char)((int) str.charAt(i) + 32));
				continue;
			}
		}
		System.out.println(str);
		scan.close();

	}

}
