package com.day8;

public class Skip_no {

	public static void main(String[] args) {
	  
		int i=0;
		
		for(i=0;i<=30;i++)
		{
		
			
			if(i%2==0 || i%3==0 || i%9==0 )
			
				continue;
			
			System.out.println("i="+i);
			
		}
		
	}	
}