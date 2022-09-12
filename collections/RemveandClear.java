package collections;

import java.util.ArrayList;



public class RemveandClear {

	public static void main(String[] args) {
		
		
		//ArrayList
		
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		System.out.println("numbers 1 to 5:"+numbers);
		
		numbers.removeAll(numbers);
		numbers.clear();
		System.out.println("ArrayList after clear"+numbers);
		
		
		ArrayList<Integer>numbers1=new ArrayList<>();
		numbers1.add(6);
		numbers1.add(7);
		numbers1.add(8);
		numbers1.add(9);
		 System.out.println("ArrayList of numbers1"+numbers1);
		 
		 numbers1.addAll(numbers);
		 System.out.println("addAll"+numbers1);
		 numbers1.remove(3);
		 System.out.println("removed index 3"+numbers1);
	}

}
