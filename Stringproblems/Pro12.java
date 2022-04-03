package com.onebill.Stringproblems;

import java.util.Scanner;

public class Pro12 {

	public static void main(String[] args) {

		System.out.println("Enter the string : ");
		Scanner scan = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		str.append(scan.nextLine());
		StringBuilder res=new StringBuilder(str.length());
		for(int i=str.length()-1;i>=0;i--) {
			res.append(str.charAt(i));
		}
		System.out.println("Reversed string: "+res);
		scan.close();
	}
}
