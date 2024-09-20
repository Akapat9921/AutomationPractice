package StringClasses;
import java.util.Arrays;
public class StringAnagram {

	public static void main(String[] args) {
		String str1 = "MotherInLaw";
		String str2 = "HitlerWoman";
		
		//converting both strings in lower case
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		//lenght of strings
		if(str1.length() != str2.length()) {
			System.out.println("Both strings are not anagram");
		}else {
			//converting both arrays into character arrays
			char[] String1 = str1.toCharArray();
			char[] String2 = str2.toCharArray();
			
			//sorting arrays
			Arrays.sort(String1);
			Arrays.sort(String2);
			
			 //Comparing both the arrays using in-built function equals ()  
			if(Arrays.equals(String1, String2) == true) {
				System.out.println("both strings are anagram");
			}else {
				System.out.println("both strings are not anagram");
			}
		}

	}

}
