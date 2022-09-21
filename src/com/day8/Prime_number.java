package com.day8;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
        
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number :");
		
		int  num=sc.nextInt();
		
		int i=2;
		
		boolean isPrime=true;
		
		while (i<num)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
			i++;
				
		}
		if(isPrime==true)
{
			System.out.println("No.is prime");
		}
		
		else {
			System.out.println("not prime");
		}
	}

}
