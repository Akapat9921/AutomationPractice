package Constructor;

public class demo3 {

	public static void main(String[] args) {
		System.out.println("Program starts:");
		primeNumber(22);

	}

	public static void primeNumber(int a) {

		int ct = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				ct++;
			}
		}
		if (ct == 2) {
			System.out.println("Given number is prime: " + a);
		} else {
			System.out.println("Given number is not prime: " + a);
		}
	}
 
}
