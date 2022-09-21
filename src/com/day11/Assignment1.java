package com.day11;

public class Assignment1 {
	
	int n;
	int factor;
    int sum;
void acceptDetails(int n)
{
	this.n=n;
	
}
void factorsSum()
{
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
	}
	
}


void showDetails()
{
	System.out.println("n -"+n);
	System.out.println("Sum -"+sum);
}
public static void main(String[]args) {
	Assignment1 Ac=new Assignment1();
	Ac.acceptDetails(120);
	Ac.factorsSum();
	Ac.showDetails();
	
}
}
