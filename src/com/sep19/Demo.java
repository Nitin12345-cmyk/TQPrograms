package com.sep19;

class Animal
{
	int legs=4;
	
}
class Dog extends Animal
{
	void show()
	{
		System.out.println("Dog has"+legs+"legs");
	}
	
}
public class Demo {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.show();

	}

}
