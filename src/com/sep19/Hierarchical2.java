package com.sep19;

class Subjects
{
	void showS()
	{
		System.out.println("Its Chemistry");
	}
}
class Chemistry extends Subjects
{
	
	void showC()
	{
		System.out.println("Its Hard");
	}
	
}
class Physics extends Subjects
{
	void showp()
	{
		System.out.println("its easy");
	}
}

public class Hierarchical2 {

	public static void main(String[] args) {
		Physics p= new Physics();
		p.showp();
		p.showS();

	}

}
