package question.paper;

public class Digit_even {

	public static void main(String[] args) {
		for(int i=100;i<=400;i++)
		{
			int a=i;
			boolean ans=true;
			while(a>0)
			{
				int n=a%10;
				if(n%2!=0)
				{
					ans=false;
					break;
				}
				a=a/10;
				
			}
			if(ans==true)
			{
				System.out.println(i);
			}
		}
	}

}
