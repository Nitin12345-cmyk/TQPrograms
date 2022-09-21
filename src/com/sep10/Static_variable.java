package com.sep10;

public class Static_variable {

	private int acno;
	protected String name;
	private float balance;
	
	public static String BankName="HDFC BANK ";//Static Variable
	public static float Irate=7.2f;//Static variable
	
	//Static method
	public static void changeIntrestRate(float newRate)
	{
		Irate=newRate;
	}
	
	Static_variable(){}
	Static_variable(int a,String n,float b)
	{
		acno=a;name=n;balance=b;
	}
	void showStatic_variableDetails()
	{
		System.out.println("Cust name -"+name);
		System.out.println("Account no -"+acno+"is with"+Static_variable.BankName);
		System.out.println("Acc Balance -"+balance);
	}
}


