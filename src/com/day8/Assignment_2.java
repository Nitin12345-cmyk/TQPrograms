package com.day8;

import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int number=sc.nextInt();
		
		switch(number%2)
		{
		case 0:
			
				System.out.println("Number is even");
				break;
			
		case 1:
			System.out.println("number is odd");
		}
		
		
	}

}
