package practisedaily;

public class Staticvariable {
	 static int a = 25, b =10;
	 static int result = a + b;
	 

	public static void main(String[] args) {
		System.out.println("Program starts");
        System.out.println("Addition of two numbers is: "+Staticvariable.result);
        
        // reinitialization
        a= 55; b =20;
        result = a + b;
        System.out.println("Updated addition is: "+Staticvariable.result);
	}

}
