package home.practice;


public class Pr {

	public static void main(String[] args) {
	
		int i,j=0,k;
		
		
		
			for(i=1;i<=20;i++)
			{
				for(k=1;k<=20;k++)
				 {
					if(i%k==0)
					{
						j=j+1;
					}
					if(j==0)
					{
						System.out.println(i);
				}
					else
					{
						System.out.println("not prime");
			   }
			}
		}
	}
}
