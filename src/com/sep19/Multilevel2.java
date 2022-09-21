package com.sep19;

class FourWheeler
{
	void show()
	{
		System.out.println("It's A Car");
		
	}
}
class Car extends FourWheeler
{
	void showC()
	{
		System.out.println("Car is good");
	}
}
class Bmw extends Car
{
	void showB()
	{
		System.out.println("Its a BMW");
	}
	
}

public class Multilevel2 {

	public static void main(String[] args) {
		Bmw B=new Bmw();
		B.showB();
		B.show();
		B.showC();

	}

}
