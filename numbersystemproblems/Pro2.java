package com.onebill.numbersystemproblems;

import java.util.Scanner;

public class Pro2 {

	public static void main(String[] args) {

		System.out.println("Enter the numbers");
		Scanner scan = new Scanner(System.in);
		int max = 0, n = 0;
		for (int i = 0; i < 5; i++) {
			n = scan.nextInt();
			if (n > max) {
				max = n;
			}
		}
		System.out.println("the largest number :: " + max);
		scan.close();
	}

}
