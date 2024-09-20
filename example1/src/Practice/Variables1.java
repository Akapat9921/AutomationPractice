package Practice;

public class Variables1 {
	static int age=45;
	double salary = 2500.55;

	public static void main(String[] args) {
		System.out.println("Program starts:");
		int a=50, b=10, res= a+b;
		System.out.println("Value of a: "+a);
		System.out.println("value of b: "+b);
        System.out.println("Addition of two no is: "+res);
        
        //re-initialization
        a=55; b=5; 
        res= a-b;
        System.out.println("Substraction of two numbers: "+res);
        
        //accessing global static variable
        System.out.println("SGV age is: "+Variables1.age);
        
        //accessing non static global variable
        Variables1 obj = new Variables1();
        System.out.println("NSGV salary is: "+obj.salary);
	}

}
