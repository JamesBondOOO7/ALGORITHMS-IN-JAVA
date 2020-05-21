package twoDArrays;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		System.out.println(list.size());
		// to add a element
		list.add(10);
		System.out.println(list);
		// import java.util.ArrayList ;
		// ArrayList<Datatype> name = new ArrayList<>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		// For printing a particular element
		System.out.println(list.get(3));
		// For removing any element
		list.remove(2);
		System.out.println(list);
		System.out.println("**************************");
		ArrayList <String> listy = new ArrayList<>();
		System.out.println(listy);
		listy.add("a");
		System.out.println(listy);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		ArrayList<Integer> example1 = new ArrayList<>();
		int [] ex = {1,2,3,4,5};
//		example.add(ex);   can't add an array directly in an arraylist
		ArrayList<Integer> example2 = new ArrayList<>();
		example1.add(10);
		example1.add(20);
		example1.add(30);
//		example2.add(example1); can't add an arraylist in an arraylist directly
	}

}
