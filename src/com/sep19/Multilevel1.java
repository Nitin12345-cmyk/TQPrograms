package com.sep19;

class D
{
	int a,b,c;
	void add()
	{
		a=10;b=20;
		c=a+b;
		System.out.println("Sum of two numbers :"+c);
	}
	void sub()
	{
		a=200;b=100;
		c=a-b;
		System.out.println("Subtraction of two numbers :"+c);
	}
}
class E extends D
{
	void multi()
	{
		a=10;b=5;
		c=a*b;
		System.out.println("Multiplication of two numbers is :"+c);
	}
	void div()
	{
		a=10;b=5;
		c=a/b;
		System.out.println("division of two numbers is :"+c);
	}
}
class F extends E
{
	void rem()
	{
		a=10;b=5;
		c=a%b;
		System.out.println("remainder of two numbers is :"+c);
	}
	
}


public class Multilevel1 {

	public static void main(String[] args) {
		F r=new F();
		r.add();
		r.sub();
		r.div();
		r.multi();
	}
}
