package com.day10;

public class Student 
{
	int St_id;
	String name;
	int phy,math,eng;
	float per;
	public void accpeptDetails(int st,String n,int p,int m,int e,float pe)
	{
	St_id=st;
	name=n;
	phy=p;
	math=m;
	eng=e;
	per=(274)*(100)/(300);
	}
	void showDetails()
	{
		System.out.println("St_id -"+St_id);
		System.out.println("name -"+name);
		System.out.println("phy -"+phy);
		System.out.println("math -"+math);
		System.out.println("eng -"+eng);
		System.out.println("per -"+per);
}
	public static void main(String[]args)
	{
		Student S=new Student();
		S.accpeptDetails(1234, "Mukesh", 85, 89, 100, 91.33f);
		System.out.println("After calling accept details");
		S.showDetails();
	}
	
				
	}
