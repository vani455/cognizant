package sortedList;
import java.util.Scanner;

public class sortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		//to take user input of length of an array
		System.out.print("Enter the number of items:");
		final int NUM_ITEMS=sc.nextInt();

		//to take user input of elements of array
		System.out.print("Enter the elements of array(seperated by space)");
		int [] arr=new int[NUM_ITEMS];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();


		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i:arr)
		  System.out.println(i);



	}

}
