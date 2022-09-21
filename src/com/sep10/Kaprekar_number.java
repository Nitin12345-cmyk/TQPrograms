package com.sep10;

import java.util.Scanner;

public class Kaprekar_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int count=0;
		int dig=0;
		int sqr=num*num;
		int p=sqr;
		int sum=0;
		
		while(sqr>0) {
			count++;
			sqr=sqr/10;
		}
		int k=(int)Math.pow(10, count/2);
		while(p>0)
		{
			sum=sum+p%k;
			p=p/k;
		}
		if(num==sum)
		{
			System.out.println("Kaprekar number");
		}
			
			else {
				System.out.println("not kaprekar");
				
			}
		}
	}


