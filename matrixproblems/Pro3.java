package com.onebill.matrixproblems;

import java.util.Scanner;

public class Pro3 {

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

	public static void print(int[][] a) {
		for (int i = 0; i < rows(a); i++) {
			for (int j = 0; j < column(a); j++) {
				System.out.print("element[" + (i + 1) + "][" + (j + 1) + "] :");
				System.out.print(a[i][j]);
				System.out.println();
			}
		}
	}
	public static int [][] transpose(int [][]a){
		int b[][]=new int[column(a)][rows(a)];
		for (int i = 0; i < rows(a); i++) {
			for (int j = 0; j < column(a); j++) {
				b[j][i]=a[i][j];
			}
		}
		return b;
	}
	public static void main(String[] args) {

		System.out.println("MATRIX =>1");
		int[][] a = getmatrix(); 
		a=transpose(a);
		print(a);
		
	}

}
