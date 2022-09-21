package com.day11;

import java.util.Scanner;


public class Account {
	int Acc_No;
	String Type;
	Double Balance;
    Double amount;

public void acceptDetails(int A,String T,Double B)
{
	Acc_No=A;
	Type=T;
	Balance=B;
}
public void showDetails()
{
	System.out.println("Acc_No -"+Acc_No);
	System.out.println("Type -"+Type);
	System.out.println("Balance -"+Balance);
}
	void deposit()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Deposit Amount");
		amount=sc.nextDouble();
	}
void withdraw()	
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter withdrawl Amount");
	amount=sc.nextDouble();
	if(Balance>=amount)
	{
		Balance=Balance-amount;
		System.out.println("withdrwal amount -"+amount);
	}
	else
	{
		System.out.println("***Insufficient Balance***");
	}
}
	void Balance()
	{
	System.out.println("Balance -"+Balance);	
	}
	public static void main(String[]args)
	{
		Account Ac=new Account();
		Ac.acceptDetails(12345678, "Saving", 25000.00);
		Ac.showDetails();
		Ac.deposit();
		Ac.withdraw();
		Ac.Balance();
	}
}
