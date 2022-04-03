package com.onebill.matrixproblems;

import java.util.Scanner;

public class Pro1 {

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
		scan.close();
		return a;
	}

	public static int rows(int[][] s) {
		return s[0].length;
	}

	public static int column(int[][] s) {
		return s.length;
	}

	public static int[][] addmatrix(int[][] a, int[][] b) {
		for (int i = 0; i < rows(a); i++) {
			for (int j = 0; j < column(a); j++) {
				a[i][j] += b[i][j];
			}

		}
		return a;
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
		if (rows(a) == rows(b)) {
			if (column(b) == column(a)) {
				a = addmatrix(a, b);
			} else {
				System.out.println("matrix mismatch");
			}
		} else {
			System.out.println("matrix mismatch");
		}
		System.out.println("RESULTANT MATRIX ");
		print(a);

	}

}
