 
package com.day8;

import java.util.Scanner;

public class Spy_number {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		
		int digit,num;
		num=sc.nextInt();
		
		int product=1;
		int sum=0;
		while(num>0)
		{
			digit = num%10;
			sum +=digit;
			product *=digit;
			num=num/10;
		}
		if(sum==product)
			System.out.println("spy no");
		else
            System.out.println("not a spy no.");
		
		
	}

}
