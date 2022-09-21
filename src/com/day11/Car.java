package com.day11;

public class Car {
	private int modelno;
	private int price=10000000;
	private String name="Audi";
	private int speed=200;
	
	public void setModelno(int modelno)
	{
		this.modelno=modelno;
	}
	public void setPrice(int p)
	{
		price=p;
		
	}
    public void setName(String name)
    {
    	this.name=name;
    }
    public void setSpeed(int speed)
    {
    	this.speed=speed;
    	
    }
    public int getModelno()
    {
    	return modelno;
    }
    public int getPrice()
    {
    	return price;
    }
    public String getname()
    {
    	return name;
    }
    public int getSpeed()
    {
    	return speed;
    }
}
