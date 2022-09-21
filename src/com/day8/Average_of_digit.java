package com.day8;

import java.util.Scanner;

public class Average_of_digit {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int total;
		int avg;
		 total=(a+b+c);
		 avg=(total/3);
		 
		 System.out.println("Average is ="+avg);
	}

}
