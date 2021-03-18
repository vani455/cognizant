package duplicateValues;

import java.util.Scanner;

public class duplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of elements ");
		int n=sc.nextInt();
		int a[]=new int[n];

     	System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();

		}
    System.out.println("duplicate elements in given array are :");
      for(int i=0;i<a.length;i++)
      {
    	  for(int j=i+1;j<a.length;j++)
    	  {
    		  if(a[i]==a[j])
    		  
    			  System.out.println( +a[j]);
    		  
    	  }
      }
      {
    	  
      }
	}

}
