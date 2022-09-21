package com.sep19;

class GrandFather
{
	void showg()
	{
		System.out.println("He is GrandFather");
	}
	
}
class Father extends GrandFather
{
	void showf()
	{
		System.out.println("He is Father");
	}
}
class Son extends Father
{
	void shows()
	{
		System.out.println("He is  son");
	}
}
class Daughter extends Father
{
	void showd()
	{
		System.out.println("She is daughter");
	}
}

public class Hybrid {
	public static void main(String[] args) {
		Son S=new Son();
		S.shows();
		S.showf();
		S.showg();
		
		Daughter D=new Daughter();
		D.showd();
		D.showf();
		D.showg();

	}

}
