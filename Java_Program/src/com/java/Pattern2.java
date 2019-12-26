package com.java;

public class Pattern2 
{
	public static void main(String[] args)
	{
		int z=1,m=1;
		
		for(int i=0;i<5;i++)
		{
			for(int j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<z;k++)
			{
				System.out.print(m);
				m++;
			}
			z=z+2;
			System.out.println();
		}
	}
}
