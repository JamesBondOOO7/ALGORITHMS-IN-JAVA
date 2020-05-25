package strings;

public class Basics {

	public static void main(String[] args) {
		String str = "Hello";
		String s = "Bye";
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.charAt(3));
		System.out.println(str.substring(2,5));
		System.out.println(str.substring(3,3));
		System.out.println(str.substring(2,3));
		System.out.println(str.substring(1));
		String s1 = "Hi";
		String s2 = "Golu";
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		System.out.println(str.indexOf("el"));
		System.out.println(str.indexOf("ab"));
		System.out.println(str.startsWith("lo"));
		System.out.println(str.startsWith("He"));
		System.out.println(s1==s2);
		String s3 = "Hi";
		String s4 = new String("Hi");
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));
	}

}
