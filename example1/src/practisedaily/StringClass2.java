package practisedaily;

public class StringClass2 {

	public static void main(String[] args) {
		String s1 = "Core Java Basics";//constant pool
		System.out.println("s1: "+s1);
		System.out.println("char count in s1: "+s1.length());
		
		String s2 = s1.replace('a', 'x');
		System.out.println("s2: "+s2);
		
		String s3 = s1.replaceFirst("a", "w");
				System.out.println("s3: "+s3);
	}

}
