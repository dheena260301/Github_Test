package collections.coverts;

import java.util.ArrayList;

public class Arraylist_to_array {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		
		names.add("dheena");
		names.add("vijay");
		names.add("tharun");
		names.add("abiram");
		names.add("govi");
		names.add("mani");
		System.out.println("ArrayList"+names); //arraylist
		
		String[]arr=new String[names.size()];//create empty array  length of name
		
		names.toArray(arr);//name convert to array in arr
		
		System.out.println("**********************Array*****************");
		
		for(String array:arr) {
			System.out.println(array);
		}
		
		
		
	}

}
