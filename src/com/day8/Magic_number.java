package com.day8;

import java.util.Scanner;

public class Magic_number {

	public static void main(String[] args) {
		
		int magic=67;
		
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter a number for guessing :");
			int n=sc.nextInt();
			if(n<magic)
			{
				System.out.println("no is less try again");
				
			}
			else if(n>magic)
			{System.out.println("no is greater try again");
			
			}
			else
			{System.out.println("no.is correct");
		}
	}

}
}
