package com.onebill.matrixproblems;

import java.util.Scanner;

public class Pro2 {

	public static int[][] getmatrix() {
		Scanner scan = new Scanner(System.in);
		System.out.println("no of rows");
		int row = scan.nextInt();
		System.out.println("no of column");
		int column = scan.nextInt();
		int a[][] = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print("element[" + (i + 1) + "][" + (j + 1) + "] :");
				a[i][j] = scan.nextInt();
			}

		}
	 
		return a;
	}

	public static int rows(int[][] s) {
		return s[0].length;
	}

	public static int column(int[][] s) {
		return s.length;
	}

	public static int[][] mulmatrix(int[][] a, int[][] b) {
		int c[][]=new int[rows(a)][column(b)];
		for (int i = 0; i < rows(a); i++) {
			for (int j = 0; j < column(a); j++) {
				for (int d = 0; d < c.length; d++) {
					c[j][i]+=a[j][d] * b[d][i];
				}
			}

		}
		return c;
	}
	public static void print(int[][] a) {
		for (int i = 0; i < rows(a); i++) {
			for (int j = 0; j < column(a); j++) {
				System.out.print("element[" + (i + 1) + "][" + (j + 1) + "] :");
				System.out.print(a[i][j]);
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("MATRIX =>1");
		int[][] a = getmatrix();
		System.out.println("MATRIX =>2");
		int[][] b = getmatrix();
		int c[][]=new int[rows(a)][column(b)];
		if(column(a) == rows(b)) {
			c=mulmatrix(a, b);
		} else {
			System.out.println("matrix mismatch");
		}
		System.out.println("RESULTANT MATRIX ");
		print(c);
	}

}
