package com.sep19;

class TwoWheeler
{
	
	void show()
	{
		System.out.println("2 wheels");
	}
	
}
class Bicycle extends TwoWheeler
{
	void Show()
	{
		System.out.println("cycle has 2 wheels");
	}
}

public class Inherit2 {

	public static void main(String[] args) {
		Bicycle B=new Bicycle();
		B.show();
		
	}

}
