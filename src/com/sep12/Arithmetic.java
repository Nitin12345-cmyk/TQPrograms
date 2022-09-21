package com.sep12;

public class Arithmetic {
	
	
	void Calculate(double h,double i)
	{
		
		System.out.println("Addition of two -"+(h+i));
		
	}
	void  Calculate(int a,float c)
	{
		
		System.out.println("Multiplication -"+(a*c));
	}
	void Calculate(float c,float b)
	{
	
		System.out.println("Substraction -"+(c-b));
		
	}
	void calculate(double d,int g)
	{
		System.out.println("Division-"+ (d/g));
		
		
	}

	public static void main(String[]args)
	{
		Arithmetic C=new Arithmetic();
		C.Calculate(5,5);
		C.Calculate(2.2, 1.1);
		C.Calculate(5, 3.5f);
		C.calculate(5.3, 2);
		
		
	}
	
}

