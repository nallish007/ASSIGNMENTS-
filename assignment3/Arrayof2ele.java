package com.onebill.assignment3;

import java.util.Scanner;

public class Arrayof2ele {
	public static  int[] getarray() {
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the array lenght : ");
		int length = scan.nextInt();
		int a[]=new int[length] ;
		System.out.println("Enter the array elements :");
		for (int i=0;i<length;i++) {
			a[i]=scan.nextInt();
		}
		int b[]=new int[2];
		if (length >2) {
			for (int i=0;i<2;i++) {
				b[i]=a[i];
			}
		}
		scan.close();
		return b;
	}

	public static void main(String[] args) {
 
		
		int a[]=Arrayof2ele.getarray();
		System.out.println("return elements  ");
		for (int i=0;i<2;i++) {
			System.out.println(a[i]);
		}
		

	}

}
