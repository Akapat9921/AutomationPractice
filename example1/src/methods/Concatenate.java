package methods;

public class Concatenate {

	public static void main(String[] args) {
		System.out.println("This program will concatenate two strings");
		String result = ConcatinateTwoString("Hello", "Everyone");
		System.out.println(result);
		

	}
	public static String ConcatinateTwoString(String str1, String str2) {
		String result = str1 + str2;
		return result;
	}

}
