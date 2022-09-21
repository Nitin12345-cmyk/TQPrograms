package com.day2;
import java.util.Scanner;


public class SwitchCaseDemo {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   
    System.out.println("how many participants:");
  
    int n=sc.nextInt();
    
    System.out.println("no. of participants are="+n);
    
    switch(n)
    {
    
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
