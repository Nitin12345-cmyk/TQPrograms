package Practice_1;

import java.util.Scanner;

public class Divisible_By_5 {

	public static void main(String[] args) {
      
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number=");
		
		int i=sc.nextInt();
		
		if (i % 5 ==0)
		{
			System.out.println("No.is divisible by 5 ");
		}
		else 
		{
			System.out.println("No.is not divisible by 5");
		}
		
	}

}
