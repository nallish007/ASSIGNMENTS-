package com.onebill.Stringproblems;

public class Pro5 {

	public static void main(String[] args) {

		String s1 = "hasddsahhjkllkjh";
		int n = 4;
		int c = 0;
		int i = 0;
		String[] s2 = new String[20];
		if (s1.length() % n == 0) {
			c = s1.length() / n;
			for (int j = 0; j < s1.length(); i++) {
				s2[i] = s1.substring(j, j + c);
				j = j + c;
			}
			for (int j = 0; j < i; j++) {

				System.out.println(s2[j]);
			}
		} else {
			System.out.println("string spliting cannot be done");
		}
	}
}
