package com.sep10;

public class Stud {
	int roll_no;
	String name;
	int st_id;
	private int marks;
	
	Stud(int roll_no,String name,int st_id)
	{
		this.roll_no= roll_no;//Firts use to shadow instance variable
		this.name=name;
		this.st_id=st_id;
	}
	
   Stud()
	{
		this(100,"Manish",123); //Second use to call the constructor
		System.out.println( this);
	} 
   Stud(int marks)
   {
	   this.marks=100;
	   
	   System.out.println("Marks");
	   
   }
   
   void show()
   {
	   System.out.println("roll no -"+roll_no);
	   System.out.println("name -"+name);
	   System.out.println("st_id -"+st_id);
	   System.out.println("Marks"+marks);
   }

	public static void main(String[] args) {
		Stud S=new Stud();
		S.show();
		
		

	}

}
