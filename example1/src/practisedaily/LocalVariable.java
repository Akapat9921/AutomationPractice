package practisedaily;

public class LocalVariable {

	public static void main(String[] args) {
		int a = 50, b= 10;
		int result = a + b;
		System.out.println("Addition of two numbers: "+result);
		
		//reinitialization
		a = 25; b= 15;
		result= a-b;
		System.out.println("substraction of two numbers: "+result);
	}

}
