package com.sep12;

public class Constructor_chaining {
	
	// default constructor
	Constructor_chaining()
	{
		this(5);// constructor 2 using this
		System.out.println("constructor 1"); 

}
	Constructor_chaining(int x) //parameterized constructor
	{
		this(5,20);// constructor 3
		System.out.println(x);
	}
	
	Constructor_chaining(int x,int y) //parameterized constructor
	{
		System.out.println(x*y);
	}
	public static void main(String[]args)
	{
		new Constructor_chaining(); 
	}
}