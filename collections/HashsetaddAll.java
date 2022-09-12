package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetaddAll {
	public static void main(String[] args ) {
		//Hashset
		HashSet<String> set=new HashSet<>();
		set.add("dheena");
		set.add("vijay");
		set.add("abiram");
		System.out.println("Hashset:"+set);
	//Arraylist
		ArrayList<String> list= new ArrayList<>();
		list.add("tharun");
		list.add("govi");
		System.out.println("ArrayList:"+list);
		
		list.addAll(0,set);
		System.out.println("Updated Arraylist"+list);
		
	Iterator it=list.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	}

}
