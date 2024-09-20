package StringClasses;
//remove all white spaces from a string in java
public class StringRemoveSpaces {

	public static void main(String[] args) {
		String s1 = "  hello i am Automation Tester  ";
		System.out.println("String s1: "+s1);
		System.out.println("String without spaces: "+s1.trim());
		System.out.println("String without spaces: "+s1.trim().length());
	}

}
