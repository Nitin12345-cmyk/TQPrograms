package com.day5;

import java.util.Scanner;

public class Automorphic_num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int count=0;
		int square=num*num;
		int temp=num;
		while(temp>0)
		{
			count++;
			temp=temp/10;
			
		}
		int lastDigit=(int) (square%(Math.pow(10,count)));
		
		if(num==lastDigit)
		{
			System.out.println(num+"automorphic number");
		}
		else
		{
			System.out.println(num+"is not automorphic");
		}

	}

}
