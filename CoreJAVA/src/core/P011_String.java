package core;

//seq of characters
public class P011_String {
	public static void main(String[] args) {
		char a[] = { 'J', 'A', 'V', 'A' };
		System.out.println(a);
		String name = "java is 2353@#$% awesome lang to learn";
		System.out.println(name);
		System.out.println(name.length());
		String name1 = "hello java";
		System.out.println(name.concat(name1));
		System.out.println(name);
		System.out.println(name.contains("is s"));
		String s1 = "java";
		String s2 = "java";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		String s4 = "        java      ";
		System.out.println(s4);
		System.out.println(s4.trim());
		String s3 = "   ";
		System.out.println(s3.isBlank());
		System.out.println(s3.isEmpty());
	}
}
