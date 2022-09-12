package collections;

import java.util.ArrayList;
import java.util.Comparator;

public class Clone {

	public static void main(String[] args) {
	ArrayList<Integer> number=new ArrayList<>();
	number.add(1);//0
	number.add(2);//1
	number.add(3);//2
	number.add(4);//3
	number.add(5);//4
	
	System.out.println("Arraylist"+number);
	
	
	
	//copy of array
	System.out.println(number.clone());
	ArrayList<Integer> Clonenumber=( ArrayList<Integer>)number.clone();
	System.out.println("cloned ArrayList"+Clonenumber);
	
	System.out.println("it contains 3"+number.contains(3));
	System.out.println("number contains clonenumber:"+number.containsAll(Clonenumber));
	System.out.println("it contains -1 :"+number.contains(-1));
	System.out.println("0 th index:"+number.get(0));
	System.out.println("index of (3):"+number.indexOf(3));
	System.out.println("size of the number Arraylist: "+number.size());
	System.out.println(Clonenumber.removeAll(Clonenumber));
	System.out.println("remove all from clone number: "+Clonenumber);
	System.out.println("if the clone is empty? "+Clonenumber.isEmpty());
	System.out.println("subString of (0,3)"+number.subList(0,3));
	System.out.println("sub string balance num Substring  :"+number.subList(3, number.size()));
	System.out.println(number.set(1, -1));
	System.out.println("2 replace -1   :"+number);
	number.sort(Comparator.naturalOrder());
	System.out.println("order    :"+number);
	number.sort(Comparator.reverseOrder());
	System.out.println("reverse order  :"+number);
	System.out.println(" to array :"+number.toArray());
	
	}

}
