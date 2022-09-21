package com.day11;

import java.util.Scanner;

public class Even_odd_switchcase {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number");
		
		int a=sc.nextInt();
		
        
		switch(a%2)
		{
		case 1:
		System.out.println(a+   "is even number");
		break;
		case 2:
			System.out.println(a   +"is odd number");
			
		}
		
		
	}
}
