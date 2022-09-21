package question.paper;

import java.util.Scanner;

public class Commision2 {

	public static void main(String[] args) {
		
		double CommisionRate=0.05;
		double TotalSales,Commision;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter sales");
		TotalSales=sc.nextDouble();
		if(TotalSales>=2000) 
		{
			Commision=TotalSales*CommisionRate;
			System.out.println(Commision);
		}
		else
		{
			System.out.println("No commision");
		}
		
		
	
		
	}

}
