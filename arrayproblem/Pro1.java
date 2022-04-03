package com.onebill.arrayproblem;

public class Pro1 {

	public static void main(String[] args) {

		int a[]= {5,9,7,6,7,5,9,1,3,8,6,1	};
		int count =0;
		int find=5;
		for (int i = 0; i < a.length; i++) {
			if (a[i]==find) {
				count++;
			}
			
		}
		System.out.println("the frequency of occurence ="+count);
	}

}
