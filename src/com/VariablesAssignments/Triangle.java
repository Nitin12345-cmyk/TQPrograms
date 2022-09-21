package com.VariablesAssignments;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base");
		int b=sc.nextInt();
		System.out.println("enter height");
		int h=sc.nextInt();
		int AreaOfTriangle=(int)(0.5*b*h);
		System.out.println("AreaOfTriangle="+AreaOfTriangle);
		

	}

}
