package Constructor;

public class demo1 {
	static int salary;
    double rent;
	public static void main(String[] args) {
		System.out.println("Progam starts:");
		int a = 25, b = 5;
		int res = a + b;
		System.out.println("Value of a is :"+ a);
		System.out.println("value of b is :"+ b);
		System.out.println("Addition of two numbers is:"+ res);
	    
		//static global variable:
		System.out.println("SGV salary is :"+ demo1.salary);
		//reinitialize SGV
		salary = 45000;
		System.out.println(" SGV updated salary is: "+ salary);
		
		//non static global variable
		demo1 obj = new demo1();
		System.out.println("Renr is: "+ obj.rent);
		
		//reinitialization NSGV
		demo1 obj1 = new demo1();
		obj1.rent = 22500.50;
		System.out.println("Updated rent is:"+ obj1.rent);
		
		
		
		

	}

}
