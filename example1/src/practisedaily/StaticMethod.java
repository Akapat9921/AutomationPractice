package practisedaily;

public class StaticMethod {

	public static void main(String[] args) {
	System.out.println("Program starts");
	StaticMethod.print();
	System.out.println("****************************");
	print();
	System.out.println("*****************************");
	address();
	}
    public static void print() {
    	int a =17 , b= 13;
    	int res = a + b;
    	System.out.println("addition of two numbers is: "+res);
    }
    public static void address() {
    	System.out.println("I am from Maharashtra.");
    	System.out.println("Leaving in Bhusawal.");
    	System.out.println("I am learning Testing");
    }
}
