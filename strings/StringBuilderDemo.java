package strings;

import java.util.ArrayList;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb);
		System.out.println(sb.length());
		sb.append("abc");
		System.out.println(sb);
		sb.insert(2,"def");
		System.out.println(sb);
		sb.insert(3, 'k');
		System.out.println(sb);
		sb.insert(sb.length(), "mnbbvhgv");
		System.out.println(sb);
		sb.deleteCharAt(6);
		System.out.println(sb);
		sb.setCharAt(sb.length()-1,'M');
		System.out.println(sb);
		System.out.println("**************************");
		StringBuilder stringo = new StringBuilder();
		System.out.println(stringo.append("hello"));
		char ch = 'A';
		System.out.println(stringo.insert(0,ch));
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		ArrayList <String> list1 = new ArrayList <>();
		list1.add("");
		System.out.println(list1.size());
		list1.add("Hello");
		list1.add("Bye");
		list1.add("Tata");
		StringBuilder sb1 = new StringBuilder(list1.get(1));
		System.out.println(sb1);
		char ch1 = 'A';
		sb1.insert(0, ch1);
		System.out.println(sb1);
		String str1 = new String(sb1);
		list1.add(str1);
		list1.add("");
		System.out.println(list1.get(4).length());
		System.out.println(str1.charAt(0));
		System.out.println("######################");
		String str2 = "";
		System.out.println(str2.charAt(0));
	}

}
