package com.sep15;

class Pen{
	String BrandName;
	int price;
	String Colour;
	
	public void setBrandName(String n)
	{
		this.BrandName=n;
	}
    public void setprice(int p)
    {
    	this.price=p;
    }
    public void setColour(String c)
    {
    	this.Colour=c;
    }
    public String getBrandName()
    {
    	return BrandName;
    }
    public int getprice()
    {
    	return price;
    }
    public String getColour()
    {
    	return Colour;
    }
	
}
public class Bag
{
	String BrandName;
	int price;
	Pen p;
	public void setBrandName(String n)
	{
		this.BrandName=n;
	}
	public void setprice(int p)
	{
		this.price=p;
	}
	public void setp(Pen b)
	{
		this.p=b;
	}
	public String getBrandName()
	{
		return BrandName;
	}
	public int getprice()
	{
		return price;
	}
	public Pen getp()
	{
		return p;
	}
	public static void main(String[]args)
	{
		Bag b=new Bag();
		b.setBrandName("AMERICAN TOURISTER");
		b.setprice(10000);
		b.setp(new Pen());
		b.getp().setBrandName("REYNOLDS");
		b.getp().setprice(10);
		b.getp().setColour("BLUE");
		System.out.println(b.getBrandName()+b.getprice()+"\n"+b.getp().getBrandName()+b.getp().getprice()+b.getp().getColour());
	}
}
