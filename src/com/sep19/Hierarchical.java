package com.sep19;

class Employee
{
	void Employee()
	{
	   System.out.println("Works for Company");	
	}
}
class Manager extends Employee
{
	void Manager()
	{
		System.out.println("Manages Everything");
	}
}
class SalesManager extends Employee
{
   void SM()
   {
	   System.out.println("Manages Sales");
   }
}
public class Hierarchical {

	public static void main(String[] args) 
	{
		SalesManager S=new SalesManager();
		S.SM();
		S.Employee();

	}

}
