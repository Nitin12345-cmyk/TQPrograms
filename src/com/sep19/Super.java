package com.sep19;

class A
{
	int a=10;
	A()
	{
		
	}
	void show(int  g)
	{
		double a=5.666;
		System.out.println(a);  
		
	}
	
 }
class B extends A
{
	int a=20;
	void show()
	{
		
		System.out.println(a);
		
	}
	public B()
	{
		int s=50;
		System.out.println(s);
	}
}
class C extends B
{
	public C()
	{
		super();
	}
	public int a=10;
	void updateDetails()
	{
		super.a=165; // first use calling instance variable of parents
		super.show(); //calling method of parents
	}
}
public class Super {

	public static void main(String[] args) {
		C r=new C();
		r.show();
		
		
}

}
