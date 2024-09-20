package practisedaily;

public class practice1 {
	static int age= 45;
	double salary = 22500.25;

	public static void main(String[] args) {
		int a=50, b=25, res = a+b;
		System.out.println("Addition of two variables is :"+res);
		
		//reinitialization values
		a=100; b=50;res= a-b;
		System.out.println("Substraction of two variables is: "+res);
		
		//calling static global variable
		System.out.println("Age is: "+practice1.age);
		
		//calling non static globle variable
		practice1 obj = new practice1();
		System.out.println("salary is: "+obj.salary);
		

	}

}
