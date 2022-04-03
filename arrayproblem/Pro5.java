package com.onebill.arrayproblem;

public class Pro5 {
	public static void main(String[] args) {
		int a[] = { 5, 9, 7, 6, 7, 5, 9, 1, 3, 8, 5, 5, 6, 3, 1 };
		int k = a.length;
		int temp2, temp;
		for (int i = 0; i < k; i++) {
			for (int j = i + 1; j < k; j++) {
				if (a[i] == a[j]) {
					temp = 0;
					for (int j1 = k - 1; j1 >= j; j1--) {
						temp2 = a[j1];
						a[j1] = temp;
						temp = temp2;
					}
					k--;
					j--;
				}
			}
		}
		for (int i = 0; i < k; i++) {
			System.out.print(a[i] + ",");
		}
	}
}
