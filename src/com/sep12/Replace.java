package com.sep12;

import java.util.Scanner;

public class Replace {
	public static void main(String[]args)
	{
	
		Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int org=n;
         int rem,ans=0,temp=1;
         
        while(n>0)
         {
        	 rem=n%10;
        	 if(rem==1)
        	 {
        		 rem=0;
        	 }
        	 
        	 ans=temp*rem+ans;
        	 temp=temp*10;
        	 n=n/10;
         }
        System.out.println(ans);
	
         }
}