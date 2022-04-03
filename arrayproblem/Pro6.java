package com.onebill.arrayproblem;

import java.util.Arrays;

public class Pro6 {

	public static void main(String[] args) {
		int a[] = { 1, 5, 8, 7, 6, 2, 9, 4, 58, 623, 41, 85 };
		System.out.print("The largest number of the array :: ");
		Arrays.stream(a).max().ifPresent(System.out::print);
	}
}
