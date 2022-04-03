package com.onebill.numbersystemproblems;

import java.util.Scanner;

public class Pro3 {
	public static void main(String[] args) {
		System.out.println("Enter the numbers");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int size = Integer.toString(num).length();
		int sum = 0;
		int q = num;
		int re = 0;
		for (int i = 0; i < size; i++) {
			re = q % 10;
			q /= 10;
			sum = sum + (int) Math.pow(re, size);
		}
		if (sum == num) {
			System.out.println("amstrong number");
		} else {
			System.out.println("non-amstrong number");
		}
		scan.close();
	}
}
