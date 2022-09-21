package com.day5;

import java.util.Scanner;

public class Twin_prime {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number :");
		int num1=sc.nextInt();
		System.out.println("Enter second number :");
		int num2=sc.nextInt();
		boolean isPrime1=true;
		boolean isPrime2=false;
		
		for(int i=2;i<num1;i++)
		{
			if(num1%i==0)
			{
				isPrime1=false;
				break;
				
			}
		}
		for(int i=2;i<num2;i++)
		{
			if(num1%i==0)
			{
			isPrime2=false;
			break;
			}
		}
		if(isPrime1==true && isPrime2==true)
		{
			if(num1-num2==2 ||num2-num1==-2)
			{
				System.out.println("both are twin prime");
			}
			else
			{
				System.out.println("both are not twin prime");
			}
		}
		else 
		{
			System.out.println("one of them is not  prime");
			
		}
		
		

	}

}
