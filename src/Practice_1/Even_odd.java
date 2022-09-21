package Practice_1;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number=");
		
		int n=sc.nextInt();
		
		if(n%2==0)
		{
			System.out.println("no.is even");
         
		}
		else if(n%2 !=0)
		
		{
			System.out.println("No.is odd");
			
		}
		else
		{ System.out.println("no.is invalid");
		}
	}

}