package arrayListToArray;
import java.util.ArrayList;

public class arrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> numberslist=new ArrayList <>();
		numberslist.add(10);
		numberslist.add(1);
		numberslist.add(18);
		numberslist.add(19);
		Integer [] array=new Integer [numberslist.size()];
		numberslist.toArray(array);
		for(Integer i:array)
		{
			System.out.println(i);
		}


	}

}
