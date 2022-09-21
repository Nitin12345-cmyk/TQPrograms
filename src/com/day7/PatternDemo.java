package com.day7;

import java.util.Scanner;

public class PatternDemo {

	public static void main(String[] args) {
		
		int i,j,n;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of lines");
		n=sc.nextInt();
	
			for( i=1;i<=n;i++)
		{
			for ( j=1;j<=n-i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
			
	}

}
