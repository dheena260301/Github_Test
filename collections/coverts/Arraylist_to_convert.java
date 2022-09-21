package collections.coverts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class Arraylist_to_convert {

	public static void main(String[] args) {
		ArrayList<String> arrlst=new ArrayList<String>();
		arrlst.add("dheena");
		arrlst.add("govi");
		arrlst.add("vijay");
		arrlst.add("tharun");
		arrlst.add("abiram");
		arrlst.add("vishnu");
		
		Collections.sort(arrlst);
		
		System.out.println(arrlst);
		
		
	LinkedList<String> at=new LinkedList<String>(arrlst);
	System.out.println("********************arraylist to linkedlist**********");
	for(String ll:at) {
		System.out.println(ll);
	}

	 Stack<String> st=new Stack<String>();
	 System.out.println("******************Arraylist to Stack***********");
		st.addAll(arrlst);
		for(String stt:st) {
			System.out.println(stt);
		}
		
		Vector<String> vtl=new Vector<String>(arrlst);
		System.out.println("**************Arraylist to Vector***************");
		for(String vt:vtl) {
			System.out.println(vt);
		}
		Set<String> hs=new HashSet<String>(arrlst);
		System.out.println("************Arraylist to hashset***********");
		for(String hst:hs) {
			System.out.println(hst);
		LinkedHashSet<String> lhs=new LinkedHashSet<String>(arrlst);
		System.out.println("****************Arraylist to LinkedHashset***********");
		for(String lhst:lhs)
		{
			System.out.println(lhst);
		}
		
		}
		
	}
	
}
