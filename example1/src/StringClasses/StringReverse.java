package StringClasses;
//reverse a string in java
public class StringReverse {

	public static void main(String[] args) {
		String s1 = "MynameisAkash.";
		System.out.println("String s1: "+s1);
		System.out.println("Reverse string: ");
		String temp = "";
		for(int i=s1.length()-1; i>=0; i--) {
			temp = temp +s1.charAt(i);
			
		}
		System.out.println(temp);
		}
	}


