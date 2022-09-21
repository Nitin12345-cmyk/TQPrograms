package com.VariablesAssignments;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double p=sc.nextDouble();
		double r=sc.nextDouble();
		double t=sc.nextDouble();
		double si=p*r*t;
		System.out.println("Simple Intrest -"+si);
		
	}

}
