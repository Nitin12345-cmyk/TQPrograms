package com.sep10;

public class Powe_of_number {

	public static void main(String[] args) {
		int x = 0;
		int base=x;
	    int y = 0;
		int exponent=y;
		int result=1;
		while(exponent!=0)
		{
			result *=base; //multiplying results by base till it becomes zero
			--exponent;
		}
		System.out.println("Answer="+result);
		
	}

}
