package com.onebill.assignment3;

import java.util.Scanner;

public class Threeofthree {
	public static boolean getarray() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array lenght : ");
		int length = scan.nextInt();
		int a[] = new int[length];
		System.out.println("Enter the array elements :");
		for (int i = 0; i < length; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		int count = 0;
		for (int i = 0; i < length; i++) {
			if (a[i] == 3) {
				if ((i)<length-1&&a[i + 1] == 3) {
					return false;
				} else {
					count++;
				}
			}
		}
		if (count == 3) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		System.out.println(Threeofthree.getarray());
	}

}
