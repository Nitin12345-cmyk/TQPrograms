package com.VariablesAssignments;

import java.util.Scanner;


public class Rectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length");
		int l=sc.nextInt();
		System.out.println("Enter breadth");
		int b=sc.nextInt();
		int AreaOfRectangle=l*b;
		System.out.println("Area Of Rectangle -"+AreaOfRectangle);
		
		

	}

}
