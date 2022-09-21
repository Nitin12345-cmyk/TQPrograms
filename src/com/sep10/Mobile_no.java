package com.sep10;

import java.util.Scanner;

public class Mobile_no {

	public static void main(String[] args) {
		
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Mobile No -");
    int n=sc.nextInt();
    
    int[] digitcount=new int[50];
    while(n!=0)
    {
    	int lastdigit=n%10;
    	digitcount[lastdigit]++;
    	n=n/10;
    }
    System.out.println("digit frequency");
    for(int i=0;i<digitcount.length;i++)
    {
    	if(digitcount[i]!=0)
    	{
    		System.out.println("  "+i+" : "+digitcount[i] );
    	}
    	sc.close();
    }
    
    
	}

}
