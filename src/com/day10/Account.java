package com.day10;

public class Account 
{
	private int acno;
	private String name;
	private float balance;
	
	public int getAcno()
	{
		return acno;
	}
	public String getName()
	{
		return name;
	}
	public float getBalance()
	{
		return balance;
	}
	public void setAcno(int no)
	{
		acno=no;
		
	}
	public void setName(String name)
	{
		this.name=name;
		
	}
	public void ssetBalance(float b)
	{
		balance=b;
		  
	}
	
public void acceptAccountDetails(int ano,String n,float b)
{ 
	acno=ano;
	name=n;
	balance=b;
	
}
}