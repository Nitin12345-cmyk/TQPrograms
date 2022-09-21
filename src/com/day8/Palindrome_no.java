package com.day8;

import java.util.Scanner;

public class Palindrome_no {
	
	public static void main(String[]args)
	{
		
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
       int num=sc.nextInt();
	int r,sum=0;
	int temp=num;
	while(num>0)
		{
		r=num%10;
		sum=(sum*10)+r;
		num=num/10;
		}
		
		
     if(temp==sum) 
     {
    	 System.out.println("It is palindrome number");
     }
     else
     {
    	 System.out.println("It is not palindrome number");
}
}
	}