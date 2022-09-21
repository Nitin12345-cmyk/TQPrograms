package com.sep10;

public class Loop {

	public static void main(String[] args) {
		int a=10;
		int b=1;
		int n;
		for(int i=1;i<=5;i++)
		{
			b=b*10;
			n=b/9;
			int j=n*i;
			System.out.println(j);
		}

	}

}
