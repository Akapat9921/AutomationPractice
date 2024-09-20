package demoexample;

public class Demo1 {
	static int age=45;// static global variable
	double salary = 2250.25;
			

	public static void main(String[] args) {
		int a=50, b=25;
		int res= a+b;
		System.out.println("Addition of two variables: "+res);
		
		//reinitialization:
		a=100; b=50; res= a-b;
		System.out.println("Subtraction of two variables is: "+res);
		
		System.out.println("value of age is: "+Demo1.age);
		 
		Demo1 obj = new Demo1();
		System.out.println("value of salary is: "+obj.salary);
		
	}

}
