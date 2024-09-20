package practisedaily;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Program for reverse number:");
		int num = 123;
		int rev = 0;
		while(num!=0) {
			int digit = num%10;
			rev = rev * 10 +digit;
			num/=10;
		}
			System.out.println("reverse no is: "+rev);
		
		
	}

}
