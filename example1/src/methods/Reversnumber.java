package methods;

public class Reversnumber {

	public static void main(String[] args) {
		int num = 1234;
		printReverseNumber(num);
		
	}
	public static void printReverseNumber(int num) {
		int rev=0;
		
		while (num!=0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num /= 10;
		}
		System.out.println("The reverse number is:"+ rev);
	}
}


