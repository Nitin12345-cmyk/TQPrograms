package com.day10;

import java.util.Scanner;


public class Duck_number {

	public static void main(String[] args) {
        int r, n, num;
        boolean flag=false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 0)
        {
            r = num % 10;
            if(r==0)
            {
                flag=true;
            }
            num = num / 10;
        }
        if(flag)
        {
            System.out.println("Duck Number");
        }
        else
        {
            System.out.println("Not Duck Number");
        }
        
    }



	}


