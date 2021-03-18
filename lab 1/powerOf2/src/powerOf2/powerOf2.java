package powerOf2;

import java.util.Scanner;

public class powerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     System.out.println("Enter a numer");
	     int n=sc.nextInt();
     if(checknumber(n))
	     System.out.println(n + "is power of 2");
     else
 	     System.out.println(n + "is  not power  of 2");

    }
	 public static boolean checknumber(int n)
	  {
	      return ( (n!=0 &&(n&(n-1))==0));
	  }

}
