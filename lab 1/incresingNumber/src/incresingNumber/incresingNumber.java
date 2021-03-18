package incresingNumber;

import java.util.Scanner;

public class incresingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     System.out.println("Enter a numer");
	     int n=sc.nextInt();
	     if(checkNumber(n))
	     {
	    	 System.out.println(n + " no. is increasing number");
	     }
	     else
	     {
	    	 System.out.println(n + " no. is not increasing number");

	     }
	     
	}
	public static boolean checkNumber(int n)
	{
		int d1=n%10;
		n=n/10;
		int d2=n%10;
	
	  return (d1>d2);

	}
}
