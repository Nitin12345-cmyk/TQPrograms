package com.sep19;

class Students
{
	void Boys()
	{
	  System.out.println("Playing Kabaddi");
	}
}

class Seniors extends Students
{
	void play()
	{
		System.out.println("Playing Cricket");
	}
}
class Juniors extends Seniors
{
	void Manage()
	{
		System.out.println("Managing Event");
	}
}

public class Multilevel {

	public static void main(String[] args)
	{
		Juniors j=new Juniors();
		j.Manage();
		j.Boys();
		j.play();
		

	}

}
