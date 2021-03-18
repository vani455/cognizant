package calculateSum;
import java.util.Scanner;

public class calculateSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a numer");
     int n=sc.nextInt();
     System.out.println("sum of  n natural numbers divisible by 3 and 5 is "+ calculateSum( n));
     
	}
	public static int calculateSum(int n)
	{
		int sum=0;
		for(int i=0;i<n;i++)
		{
			if(i%3==0||i%5==0)
			{
				sum =sum+i;
			}
		}
		return sum;
	}

}
