package com.onebill.Stringproblems;

import java.util.Arrays;
import java.util.Scanner;

public class Pro3 {

	public static void main(String[] args) {

		System.out.println("Enter the string : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String con="bcdfghjklmnpqrstvwxyz";
		con=con.concat(con.toUpperCase());
		char[]v=con.toCharArray();
		char a[] = str.toCharArray();
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (Arrays.binarySearch(v, str.charAt(i))>=0 ) {
				count++;
			}
		}
		System.out.println("consonants count : "+count);
		scan.close();
	}

}
