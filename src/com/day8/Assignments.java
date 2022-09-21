package com.day8;
import java.util.Scanner;


public class Assignments {

	public static void main(String[] args) {
		int month;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter month");
		month=sc.nextInt();
		

		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 12:
			System.out.println("Number of days is 31");
			break;
			
		case 4:
		case 6:
		case 9:
		case 10:
		case 11:
			System.out.println("Number of days is 30");
			break;
			
		case 2:
			
			System.out.println("Number of days is 29");
			break;
			
			default:
				System.out.println("Invalid Month");
				

		}
	}

}
