package com.sep12;

import java.util.Scanner;

public class Power_of_3 {

	public static boolean isPowerOfThree(int n)
	{
		if (n<3)
	   return false;
		
		while(n%3==0)
		{
			n/=3;
			
		}
		return n==1;
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no -");
		int n=sc.nextInt();
		if(isPowerOfThree(n))
			System.out.println(n+"is power of three");
		else
			System.out.println(n+"is not power of three");
	}

}
