package question.paper; 

import java.util.Scanner;

public class Commision {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter sales price");
	int sale=sc.nextInt();
	double comm=(sale>15000)?(sale*0.5):0;
	System.out.println("Commision="+comm);

	}

}
