package trafficlight;
import java.util.Scanner;

public class trafficlight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in); 
		System.out.println("enter a number from 1 to 3 to display signal:");
		System.out.println("1.red"+"\n"+"2.green"+"\n"+"3.yellow");

		int signal=sc.nextInt();

		if(signal==1) {
       System.out.println("stop");
		}

		else if(signal==2) {

		System.out.println("go");
		}

		else if(signal==3) {

		System.out.println("ready");
		}

		else

		System.out.println("please enter valid input");

	}
		
}
