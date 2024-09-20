package StringClasses;

public class NonConstToConstPool {

	public static void main(String[] args) {
	String s1 = "Java";
	String s2 = "Java";
	String s3 = new String("Java");
	String s4 = new String("Java").intern();
	System.out.println((s1==s2)+",string are equal");
	System.out.println((s1==s3)+",strings are not euqal");
	System.out.println((s1==s4)+",strings are equal");
			

	}

}
