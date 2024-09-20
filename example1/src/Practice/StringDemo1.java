package Practice;

public class StringDemo1 {

	public static void main(String[] args) {
		String s1 = "Hello";
		System.out.println("s1: "+s1);
		String s2 = "Hi";
		System.out.println("s2: "+s2);
		String s3 = "Hello";
		System.out.println("s3: "+s3);
		System.out.println("comparing s1 and s2 using equals with value: "+s1.equals(s2));
		System.out.println("comparing s1 and s2 using '==' with address: "+(s1==s2));
		
		System.out.println("comparing s1 and s2 using equals with value: "+s1.equals(s3));
		System.out.println("comparing s1 and s2 using '==' with address: "+(s1==s3));
		
		String s6 = new String("Hello");
		System.out.println("comparing s1 and s6 using equals with value: "+s1.equals(s6));
		System.out.println("comparing s1 and s6 using '==' with address: "+(s1==s6));
		
		

	}

}
