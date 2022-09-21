package question.paper;

import java.util.Scanner;

public class WorkPlace {

	public static void main(String[] args) {
		System.out.println("Enter age");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter sex(M or F)");
		char b=sc.next().charAt(0);
		System.out.println("Enter maritul Status(Y or N)");
		char c=sc.next().charAt(0);
		
		if ((a>=20)&&(a<60))
		{
			if(b=='f'|| b=='F' && (a>=20&&a<=60))
            System.out.println("Place of service = Urban Areas Only");
		}
		else if(b=='m'|| b=='M' && (a>=20&&a<=40))
		{
			System.out.println("Place of Service=Can Work Anywhere");
		}
		else if(b=='m'||b=='M' && (a>40 && a<=60))
		{
			System.out.println("Place of Work=Urban areas only");
		}
		else
		{
			System.out.println("Error");
		}

	}

}
