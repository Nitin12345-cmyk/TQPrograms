package com.sep15;

class Engine
{
	String type;
	
	Engine(String type)
	{
		this.type=type;
		
	}
	public String toString()
	{
		return type;
	}
}
class Gear{
	String gear;
	
	Gear(String gear)
	{
		this.gear=gear;
	}
	public String toString()
	{
		return gear;
	}
}

public class Car {
	
	int modelNo;
	String name;
	int price;
	Engine engine;
	Gear gear;
	
	Car(int modelNo,String name,int price,Engine engine,Gear gear)
	{
		this.modelNo=modelNo;
		this.name=name;
		this.price=price;
		this.engine=engine;
		this.gear=gear;
	}
	public String toString()
	{
		return modelNo+" "+name+" "+price+" "+engine+" "+gear;
	}
	
	public static void main(String[] args) 
	{
		Car C=new Car(34,"BMW",5000000,new Engine("Diesel"),new Gear("Stronic"));
		System.out.println(C);
		
		

	}

}
