package replaceAlphabet;
import java.util.Scanner;

public class replaceAlphabet {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		
		
        System.out.println("the altered string is:"+alterString(str));
	}
	private static String alterString(String pStr)
	{
		String alteredStr="";
		for(int i=0;i<pStr.length();i++)
		{
		if(pStr.charAt(i)=='a' ||pStr.charAt(i)=='A'||
				pStr.charAt(i)=='e'||pStr.charAt(i)=='E'||
				pStr.charAt(i)=='i' ||pStr.charAt(i)=='I'||
				pStr.charAt(i)=='o' ||pStr.charAt(i)=='O'||
				pStr.charAt(i)=='u' ||pStr.charAt(i)=='U' )
		alteredStr+=pStr.charAt(i);
		else
		{
			char replaceChar=(char)((char) pStr.charAt(i)+1);
			alteredStr+=replaceChar;
		}
		}
		return alteredStr;


	}

	}


