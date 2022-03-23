package com.onebill.abstract_assignments;

public class Main {

	public static void main(String[] args) {
		BankA A = new BankA();
		BankB B = new BankB();
		BankC C = new BankC();
		System.out.println(A.getbalance());
		System.out.println(B.getbalance());
		System.out.println(C.getbalance());
	}
}
