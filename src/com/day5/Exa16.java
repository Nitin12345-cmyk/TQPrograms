package com.day5;

import java.util.Scanner;

public class Exa16 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n :");
		int n=sc.nextInt();
		int t=3;
		for(int i=1;i<=n;i++)
		{
			System.out.println(t+"");
			t*=2;
		}
		
	}

}
