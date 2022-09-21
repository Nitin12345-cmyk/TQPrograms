package Practice_1;

import java.util.Scanner;

public class Ternary_operator {

	public static void main(String[] args) {
		int a,b,c;
    
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st no :");
		System.out.println("Enter 2nd no :");
		
		a=sc.nextInt();
		b=sc.nextInt();
		
	    c = (a>b) ? a:b;
		System.out.println("greater number is ="+c);
		
	}

}
