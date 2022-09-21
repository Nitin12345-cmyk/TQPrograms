package home.practice;

public class Reverse_num {

	public static void main(String[] args) {
		int n=987;
		int lastDigit=0;
	    int reverse=0;
	    while(n>0)
	    {
	      lastDigit=n%10;
	      reverse=reverse*10+lastDigit;
	      n=n/10;
	    }
	    System.out.println(reverse);
	}

}
