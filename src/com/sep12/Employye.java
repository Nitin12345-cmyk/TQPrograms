package com.sep12;

public class Employye {
	int emp_id;
	String name;
	int Salary;
	
	void acceptDetails(int id,String n,int S)
	{
		emp_id=id;
		name=n;
		Salary=S;
		
	}
	
	void showDetails() 
	{
      System.out.println("emp_id -"+emp_id);
      System.out.println("name -"+name);
      System.out.println("Salary" +Salary);
	}
	public static void main(String[]args)
	{
		Employye e=new Employye();
		e.acceptDetails(121, "Manish", 50000);
		e.acceptDetails(111,"Mukesh", 51000);
		e.acceptDetails(123, "Naresh", 52000);
		e.showDetails(); 
		
	}
	
}
