package stringTokenizer;
import java.util.Scanner;
import java.util.StringTokenizer;
public class stringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the integers with space:");
		String line=sc.nextLine();
		StringTokenizer st=new StringTokenizer(line);
		int sum=0,i=1;
		while(st.hasMoreTokens())
		{
			int n=0;
			n=Integer.parseInt(st.nextToken());
			System.out.println("number " +n);
			sum=sum+n;
		}
		System.out.println("sum"+sum);

		


	}

}
