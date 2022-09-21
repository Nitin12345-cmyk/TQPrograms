package com.VariablesAssignments;

import java.util.Scanner;

public class Subject {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of subject 1 -");
		int s1=sc.nextInt();
		System.out.println("Enter marks of subject 2 -");
		int s2=sc.nextInt();
		System.out.println("Enter marks of subject 3 -");
		int s3=sc.nextInt();
		System.out.println("Enter marks of subject 4 -");
		int s4=sc.nextInt();
		System.out.println("Enter marks of subject 5 -");
		int s5=sc.nextInt();
		int total=s1+s2+s3+s4+s5;
		int avg=(s1+s2+s3+s4+s5)/5;
		double per=(int)(s1+s2+s3+s4+s5*100)/500;
		System.out.println("Total ="+total);
		System.out.println("Average ="+avg);
		System.out.println("Percentage ="+per);
	}

}
