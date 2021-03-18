package mirrorImage;
import java.util.Scanner;

public class mirrorImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str=sc.next();
		System.out.println(getMirrorString(str));
	    
	}
    private static String getMirrorString(String pStr)
    {
    	StringBuffer reverseStr=new  StringBuffer(pStr);
    	reverseStr.reverse();
    	return pStr+"|"+reverseStr;
    
    }


	}

