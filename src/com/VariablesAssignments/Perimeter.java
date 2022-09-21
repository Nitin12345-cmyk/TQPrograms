package com.VariablesAssignments;

import java.util.Scanner;

public class Perimeter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length -");
		double l=sc.nextDouble();
		System.out.println("Enter Breadth -");
		double b=sc.nextDouble();
		double p=l+b+l+b;
		System.out.println("Perimeter ="+p);

	}

}
