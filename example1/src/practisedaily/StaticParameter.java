package practisedaily;

public class StaticParameter {

	public static void main(String[] args) {
		System.out.println("Program starts");
		StaticParameter.Addition();
		System.out.println("**************************");
		StaticParameter.AdditionOfTwo(50, 50);
		System.out.println("***************************");
		StaticParameter.AdditionOfTwo(20, 20);
	}
	public static void Addition() {
		int a = 15, b = 20;
		int res = a + b;
		System.out.println("Addition is: "+res);
	}
    public static void AdditionOfTwo(int a, int b) {
    	int result =  a + b;
    	System.out.println("first number is: "+a);
    	System.out.println("Second number is: "+b);
    	System.out.println("Addition of two numbers is: "+result);
    }
}
