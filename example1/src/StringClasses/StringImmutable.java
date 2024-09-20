package StringClasses;

public class StringImmutable {

	public static void main(String[] args) {
		String org = "Hello";
		System.out.println("Source string is: "+org);
		
		String change = org.concat("World");
		
		System.out.println("Modified string: "+change);
		
		System.out.println("source string after modify: "+org);

	}

}
