package com.sep12;

public class Area {
	
	void Area(float a,float b,float c)
	{
		System.out.println("Area of Circle -"+a*b*c);
		
	}

	void Area(int a,int b)
	{
		System.out.println("Area of rectangle -"+a*b);
	}
	
	void Area(double h,int a,int b)
	{
		
		System.out.println("Area of triangle -"+h*a*b);
	}
	
	public static void main(String[]args)
	{
		Area A=new Area();
		A.Area(5, 3);
		A.Area(0.5, 5, 3);
		A.Area(3.14f, 5.3f, 3.2f);
	}
}
