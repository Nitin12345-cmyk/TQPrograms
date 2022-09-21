package com.day11;

public class Shopping {
	String Item;
	int Quantity;
	int Price;

	public void acceptDetails(String I, int Q, int P) 
	{
		Item = I;
		Quantity = Q;
		Price = P;

	}
	public void CalculateBill()
	{
		int Bill=Quantity*Price;
		if(Quantity>0)
		{
			System.out.println("Bill -" +Bill);
		}
		else
		{
			System.out.println("Error");
		}
	}

	public void showDetails()
	{
		System.out.println("Item -"+Item);
		System.out.println("Quantity -"+Quantity);
		System.out.println("Price -"+Price);

	}
	public static void main(String[]args)
	{
		Shopping Sh=new Shopping();
		Sh.acceptDetails("Soaps", 25,10 );
		Sh.CalculateBill();
		Sh.showDetails();
	}
}