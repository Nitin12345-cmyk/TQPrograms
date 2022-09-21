package com.day5;

import java.util.Scanner;

public class Exa14 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n,i=1;
		System.out.println("enter range");
		n=sc.nextInt();
		while(i<=n)
		{
			System.out.println(i*i*i+"");
			i++;
		}
		
		

	}

}
