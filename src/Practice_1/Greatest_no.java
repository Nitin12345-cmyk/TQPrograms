package Practice_1;

import java.util.Scanner;

public class Greatest_no {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter no.1 :");
		System.out.println("enter no.2 :");
		System.out.println("enter no.3 :");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();


		
		if(a>b && a>c)
		{
           System.out.println("a is greater no.");
		}
		else if(b>c && b>a) {
			System.out.println(" b is greater no.");
		}
		else {System.out.println("c is greater no");
	}

}
}