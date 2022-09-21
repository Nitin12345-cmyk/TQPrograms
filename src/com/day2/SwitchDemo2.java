package com.day2;

import java.util.Scanner;

public class SwitchDemo2 {
	public static void main(String[]args) {

	 Scanner sc=new Scanner(System.in);
	   
	    System.out.println("how many participants:");
	  
	    int n=sc.nextInt();
	    
	    System.out.println("no. of participants are="+n);
	    
	    switch(n)
	    {
	    case 1 :
	    case 2 :
	    case 3 :
	    
	    case 4 :System.out.println("lets arrange a car");
	   break;
	   
	    case 8 : System.out.println("lets arrange ertiga");
	    break;
	    
	    case 15 : System.out.println("lets arrnge traveller");
	    break;
	    
	    case 20 : System.out.println("lets arrange minibus");
	    break;
	    
	    default : System.out.println("invalid no.");
	    
	    }
	   
		}

	}


