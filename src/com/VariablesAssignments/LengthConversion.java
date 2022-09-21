package com.VariablesAssignments;

import java.util.Scanner;

public class LengthConversion {

	public static void main(String[] args) {
          double m,km;
          Scanner sc=new Scanner(System.in);
          System.out.println("enter length in cm -");
          double c=sc.nextDouble();
          m=c/100.0;
          km=c/1000.0;
          System.out.println("Length in meter ="+m);
          System.out.println("Length in kilometer ="+km);
         
          


	}

}
