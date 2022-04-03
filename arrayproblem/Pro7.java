package com.onebill.arrayproblem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Pro7 {
	public static int max(List<Integer> al, int n) {
		List<Integer> al1 = new ArrayList<Integer>(al);
		int max = al1.stream().max(Comparator.comparing(Integer::valueOf)).get().intValue();
		for (int i = 0; i < n; i++) {
			final int max1 = max;
			al1 = al1.stream().filter(intt -> intt.intValue() != max1).collect(Collectors.toList());
			max = al1.stream().max(Comparator.comparing(Integer::valueOf)).get().intValue();
		}
		return max;
	}

	public static void main(String[] args) {
		int[] a = { 1, 5, 8, 7, 6, 2, 9, 4, 58, 623, 41, 185 };
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int aa : a) {
			al.add(aa);
		}
		System.out.println("The second largest number of the array :: "+max(al, 1));
	}
}
