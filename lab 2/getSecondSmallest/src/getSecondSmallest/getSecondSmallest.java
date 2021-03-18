package getSecondSmallest;
import java.util.Scanner;

public class getSecondSmallest {

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
		
	    System.out.println("second smallest element is " +getSecondSmallestt(a,n));
	}
	
	public static int getSecondSmallestt(int a[],int n)
	{ int temp=0;
	   for(int i=0;i<n;i++)
	   {
		   for(int j=i+1;j<n;j++)
		   {
			   if(a[i]>a[j])
			   {
				   temp =a[i];
				   a[i]=a[j];
				   a[j]=temp;
			   }
		   }
	   }
	return a[1];
		
	}

}
