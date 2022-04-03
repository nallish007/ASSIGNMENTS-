package com.onebill.array;

import java.util.*;

public class Assending  {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int size = scan.nextInt();
		int a[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("\na[" + i + "] = ");
			a[i] = scan.nextInt();
		}

		int temp=0;
		for (int i=0;i<size;i++) {
			for (int j=0;j<size;j++)
			{
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i=0;i<size;i++) {
			System.out.println(a[i]);
		}
		scan.close();
		
	}

}
