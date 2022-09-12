package collections;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

public class Listsyntax {

	public static void main(String[] args) {
		
		List<String> li=new ArrayList<>();//list  interface
		ArrayList<String> list=new ArrayList<String>();///arraylist class
		list.add("dheena");
		list.add("vijay");
		list.add("govi");
		list.add("tharun");
		list.add("mani");
		System.out.println(list.get(3));
		list.remove(2);
		System.out.println("arraylist:"+list);
		list.add(3, "vishnuprasath");
		System.out.println("updated arraylist"+list);
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			
			System.out.println(it.next());
			
		}
		ArrayList<String>addedlist=new ArrayList<>();
		addedlist.add("govi");
		
		addedlist.add("prasanth");
		addedlist.addAll(2,list);//insert inbetween
		System.out.println("addedlist"+addedlist);
	}
}
