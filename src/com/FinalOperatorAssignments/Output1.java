package com.FinalOperatorAssignments;

import java.util.Scanner;

public class Output1 {

	public static void main(String[] args) {
		int a,b;
		int resulta,results,resultm;
		float resultd;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		a=sc.nextInt();
		System.out.println("Enter b:");
		b=sc.nextInt();
		resulta=a+b;
		results=a-b;
		resultm=a*b;
		resultd=(float)a/b;
		System.out.println("The result of adding is"+resulta);
		System.out.println("The result of subtracting is"+results);
		System.out.println("The result of multiplying is"+resultm);
		System.out.println("The result of division is"+resultd);
	}

}
