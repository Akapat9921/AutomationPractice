package practisedaily;

public class MethodOverloading {

	public static void main(String[] args) {
		System.out.println("Program starts");
		addNumber();
		System.out.println("********************************");
		addNumber(12, 12);
		System.out.println("********************************");
		addNumber(10.50,10);

	}
	static public void addNumber() {
		int a = 10, b = 15;
		int res = a + b;
		System.out.println("addition of two numbers is: "+res);
	}
	static public void addNumber(int a, int b) {
		int result = a + b;
		System.out.println("addition of number is: "+result);
	}
	static public void addNumber(double a, int b) {
		double res = a + b;
		System.out.println("Addition of two numbers is: "+res);
	}

}
