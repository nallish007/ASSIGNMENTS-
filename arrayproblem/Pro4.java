package com.onebill.arrayproblem;

public class Pro4 {

	public static void main(String[] args) {
		int a[] = { 5,  9, 7, 6, 7, 5, 9, 1, 3, 8, 5, 5, 6, 3, 1 };
		int b[] = new int[20];
		int k = 0;
		boolean s = false;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					for (int j2 = 0; j2 < k; j2++) {
						if (a[j] == b[j2]) {
							s = true;
							break;
						}
					}
					if (s) {
						s = false;
					} else {
						b[k] = a[j];
						k++;
						break;
					}
				}
			}
		}
		System.out.println("The duplicate elements of the array");
		for (int i = 0; i < k; i++) {
			System.out.print(b[i] + ",");
		}
	}

}
