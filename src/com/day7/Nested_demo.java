package com.day7;

public class Nested_demo {

	public static void main(String[] args) {
      
		for(int num=1;num<=10;num++)
		{
			int n=num;
			boolean isPrime=true;
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					isPrime=false;
					break;
				}
				
				
			}
			if (isPrime==true);
			{
				System.out.println(n);
			}
			num++;
			
		}
	}

}
