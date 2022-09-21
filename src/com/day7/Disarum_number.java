package com.day7;

import java.util.Scanner;

public class Disarum_number {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number :");
		
		int num=sc.nextInt();
		int num1=num;
		int count=0;
		
		while(num!=0) {
			num /=10;
			count++;
		}
		num=num1;
		int sum=0;
		
		while(num!=0)
		{
			int d=num%10;
			sum +=Math.pow(d,count);
			count--;
			num/=10;
		}
		if (sum==num1)
			System.out.println("Disarium number");
		else
			System.out.println("Not a Disarium number");

	}

}
