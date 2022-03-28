package com.onebill.assignment3;

import java.util.Scanner;

public class Fibonacci {

	
	public static void main(String[] args) {

	Scanner scan=	new Scanner(System.in);
	int num=scan.nextInt();
	int prenum1=0;
	int prenum2=1;
	int res=0;
	System.out.println(prenum1);
	System.out.println(prenum2);
	for (int i=0;prenum2<num;i++) {
		res=prenum1+prenum2;
		System.out.println(res);
		prenum1=prenum2;
		prenum2=res;
	}
	}

}
