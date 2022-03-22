package com.onebill.assignment;

public class Evenodd {

	public static void main(String[] args) {
		int n=15;
		System.out.print("EVEN NUMBERS ");
		System.out.print("   ODD NUMBERS\n");
		for (int i=0; i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.print("\t"+i);
			}
			else
			{
				System.out.print("\t     "+i+"\n");
			}
		}
		
	}

}
