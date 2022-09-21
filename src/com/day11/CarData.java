package com.day11;

public class CarData {
	public static void main(String[]args) {
		
	
	Car c=new Car();
	
	System.out.println(c.getModelno());
	System.out.println(c.getname());
	System.out.println(c.getPrice());
	System.out.println(c.getSpeed());
	
	c.setModelno(123);
	c.setName("Vista");
	c.setPrice(400000);
	c.setSpeed(125);
	
	System.out.println("---------------------------");
	System.out.println(c.getModelno());
	System.out.println(c.getname());
	System.out.println(c.getPrice());
	System.out.println(c.getSpeed());
}
}