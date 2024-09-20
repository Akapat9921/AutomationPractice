package WrapperClass;

public class StringClass1 {

	public static void main(String[] args) {
		String s1 = "Core Java Basics";
		System.out.println("s1-->"+s1);
		System.out.println("char count in s1: "+s1.length());
		
		String s2 =s1.replace('a', 'X');
		System.out.println("s2: "+s2);
		
		String s3 = s1.replace("a", "W");
		System.out.println("s3: "+s3);

	}

}
