package com.day7;

public class Sum_of_prime_numbers {

	public static void main(String[] args) {
      
		int count,sum=0;
		
		for(int number=1;number<=20;number++)
		{
			count=0;
			for(int i=2;i<=number/2;i++)
			{
				if(number%i==0)
				{
					count++;
					break;
				}
			}
			if(count==0&&number!=1)
			{
				sum=sum+number;
			}
		}
		System.out.println("Sum of prime numbers is : "+sum);
			
	}

}
