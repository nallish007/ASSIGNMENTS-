package com.onebill.assignment;

public class Series {

	public static void main(String[] args) {
		int a=5;
		int b=4;
		int e=5;
		int sum=0;
		for (int i=1;i<=e;i++)
		{
			sum=(a+b);
			
			for (int j=1;j<i;j++)
			{
				
				sum=sum+(b*(int)Math.pow(2, j));
			}
			System.out.print(sum+",");
			
		}

	}

}
