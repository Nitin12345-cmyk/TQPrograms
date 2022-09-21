package com.sep15;

import java.util.Scanner;

public class Missing_num {

	public static void main(String[] args) {
       
		int sum=0,sum1=0;
		for(int i=1;i<=7;i++)
		{
		 sum=sum+i;
		}
		System.out.println(sum);
		System.out.println("enter number 1 to 7");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num>0)
		{
			int rem=num%10;
			sum1=sum1+rem;
			num=num/10;
		}
		if(sum==sum1)
		{
			System.out.println("not missing");
		}
		else
		{
			int value=sum-sum1;
			System.out.println(value+" ");
		}
	}

}
