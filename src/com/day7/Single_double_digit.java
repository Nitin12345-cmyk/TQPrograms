package com.day7;

import java.util.Scanner;


public class Single_double_digit {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number :");
		
		int x=sc.nextInt();
		
		if ((x>9 && x<100) || (x<-9 && x> -100))
		
		{
			System.out.println("double digit");
			
		}
		else if(x<9 && x>=0)
		{
			System.out.println("single digit");
		}
		else {
			System.out.println("invalid");
		}
		
		
		
	}

}
