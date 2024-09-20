package methods;

public class Addition {

	public static void main(String[] args) {
		System.out.println("This program will give the Addition of numbers:");
		int sum = additionOfNumbers (15, 25);
		System.out.println(sum);
	
	}
	public static int additionOfNumbers(int a, int b) {
		 int sum = a + b;
		 return sum;
	}

}
