package com.sep19;

class Student
{
	int roll,marks;
	String name;
	void input()
	{
		System.out.println("enter roll name & marks");
	}
	
}
class Nitin extends Student
{
	void display()
	{
		roll=1;
		name="Nitin";
		marks=90;
		System.out.println(roll+" "+name+" "+marks);
	}
}

public class SimpleInheritance {

	public static void main(String[] args) {
		Nitin n=new Nitin();
		n.input();
		n.display();

	}

}
