package com.day2;

import java.util.Scanner;

public class For_loop_example {

	public static void main(String[] args) {
        
		Scanner sc=new Scanner(System.in);
		
		int i;
		System.out.println("enter no.");
		
		int no = sc.nextInt();
		
		for( i=1; i<=10; i++)
		{
			System.out.println(+i);
	}

}
}