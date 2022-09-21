package com.day10;

public class Vehicle {

	int ModelNo;
	String Name;
	int Price;

public void acceptDetails(int M,String N,int P)
{
   ModelNo=M;
   Name=N;
   Price=P;
	
}
void showDetails()
{
	System.out.println("ModelNo - "+ModelNo);
	System.out.println("Name - "+Name);
	System.out.println("Price - "+Price);
}
public static void main(String[]args)
{
	Vehicle v=new Vehicle();
	v.acceptDetails(12444, "Audi", 20000000);
	v.showDetails();
	
}
}