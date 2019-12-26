package com.java;

public class Pattern 
{
	public static void main(String[] args)
	{
		int star=1;
		int space=7;
		for(int i=0;i<=8;i++)
		{
			for(int j=space;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<star;k++)
			{
				System.out.print("*");
			}
			star+=2;
			System.out.println();
		}
	}
}
