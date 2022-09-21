package Practice_1;

import java.util.Scanner;

public class Positive_negative {

	public static void main(String[] args) {
     
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number=");
		
		int n=sc.nextInt();
		
		if (n>0)
		{
			System.out.println("no.is positive");
		}
		else if(n<0)
		{
			System.out.println("no. is negative");
		}
		else if(n==0)
		{
			System.out.println("no.is zero");
		}
		else
		{
			System.out.println("Invalid no2a");
		}
	}

}
