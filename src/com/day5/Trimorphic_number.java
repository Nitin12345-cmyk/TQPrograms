package com.day5;

import java.util.Scanner;

public class Trimorphic_number {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int flag=0;
		int Cube_power=num*num*num;
		while(num!=0)
		{
			if (num%10!=Cube_power%10)
			{
				flag=1;
				break;
				
			}
			num/=10;
			Cube_power /=10;
		}
		if(flag==0) {
			System.out.println("it is trimorphic number");
		}
	else
	{
		
	
		System.out.println("not trimprphic");
	}
	
}
}
