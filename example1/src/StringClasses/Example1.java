package StringClasses;

public class Example1 {

	public static void main(String[] args) {
		String s1 = "Hello";
		System.out.println("s1: "+s1);
		System.out.println("Char count in s1: "+s1.length());
		String s2 = "Hi";
		System.out.println("s2: "+s2);
		String s3 = "Hello";
		System.out.println("s3: "+s3);
		System.out.println(" comparing s1 and s2 using equals() with value: "+s1.equals(s2));
		System.out.println(" comparing s1 and s2 using == with address: "+(s1==s2));
		System.out.println(" comparing s1 and s3 using equals() with value: "+s1.equals(s3));
		System.out.println(" comparing s1 and s3 using == with address: "+(s1==s3));
		System.out.println("*************************************************");
		
		String s4 = new String("Mumbai");//1.String constant pool 2. non constatnt pool(it will create two objects)
		String s5 = new String("Pune");//1.String constant pool 2. non constatnt pool(it will create two objects)
		String s6 = new String ("Hello");//non const pool
		
		System.out.println(" comparing s4 and s5 using equals() with value: "+s4.equals(s5));
		System.out.println(" comparing s4 and s5 using '==' with value: "+(s4==s5));
		
		
		System.out.println(" comparing s6 and s1 using equals() with value: "+s6.equals(s1));
		System.out.println(" comparing s6 and s1 using equals() with value: "+(s6==s1));
	}

}
