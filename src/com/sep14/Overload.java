package com.sep14;

public class Overload {
	
	public static void School() {
		System.out.println("Overoad.School");
	}
	public static void Coll(int a) {
		System.out.println("Overload.Coll(int)");
	}
	public static void main(String[]args)
	{
		Overload.School();
		Overload.Coll(10);
	}

}
