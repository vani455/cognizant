import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     System.out.println("Enter a numer");
	     int n=sc.nextInt();
	     System.out.println("diiference is " +calculateDifference(n));

	}
	public static int calculateDifference(int n)
	{
		int sum1=0;int sum2=0;int difference = 0;int  squareOfSum=0;
		for(int i=0;i<=n;i++)
		{
			 sum1=sum1+(i*i);
		     sum2=sum2+i;
            squareOfSum= (sum2)*(sum2);
		}
        difference=(squareOfSum-sum1 );     

		  return difference;

	}
}
