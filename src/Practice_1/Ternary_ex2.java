package Practice_1;

import java.util.Scanner;


public class Ternary_ex2 {

	public static void main(String[] args) {
		
		int a,b,c,d;
		
		Scanner sc=new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt(); 
		c=sc.nextInt();
		
		d = c > (a>b ? a : b) ? c : ((a>b)?a:b);
	
		System.out.println("Largest number is :" +d);
		
		
		

	}

}
