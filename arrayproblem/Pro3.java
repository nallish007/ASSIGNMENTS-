package com.onebill.arrayproblem;

public class Pro3 {

	public static void main(String[] args) {
		int a[] = { 5, 9, 7, 6, 7, 5, 9, 1, 3, 8, 6, 1 };
		int temp = 0;
		int temp2 = 0;
		//
		for (int i = 0; i < 2; i++) {
			temp = a[a.length-1];
			for (int j = 0; j < a.length; j++) {
				temp2 = a[j];
				a[j] = temp;
				temp= temp2;
			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+",");
			
		}
	}

}
