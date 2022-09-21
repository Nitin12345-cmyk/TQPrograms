package com.VariablesAssignments;

import java.util.Scanner;

public class Days 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter days -");
		int D=sc.nextInt();
		int Years=D/365;
		int weeks=D/7;
		int months=D/30;
		System.out.println("Years="+Years);
		System.out.println("weeks="+weeks);
		System.out.println("months="+months);
	}

}
