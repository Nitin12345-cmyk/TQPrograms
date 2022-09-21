package com.sep19;
                            //SINGLE INHERITANCE
class Persons
{
	void play()
	{
		System.out.println("Plays cricket");
	}
	
}
class Boys extends Persons
{
	void Injured() 
	{
		System.out.println("Not Playing");
	}
}
class Inherit
{
	public static void main(String[]args)
	{
		Boys b=new Boys();
		b.play();
		b.Injured();
	}
}