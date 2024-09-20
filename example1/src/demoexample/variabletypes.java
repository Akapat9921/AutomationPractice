package demoexample;

public class variabletypes {
	static int age;  //Global variable static
	double salary;   //non static global variable

	public static void main(String[] args) 
	{
		//local variable
		int num1=10, num2=5;
		System.out.println("Local var num1:" + num1);
		System.out.println("Local var num2:"+ num2);
		
		//accessing static global variable
		System.out.println("SGV age:"+ age);
		age=55;
		System.out.println("updated SGV age:"+ age);
		
		//accessing non static global variable
		variabletypes ref = new variabletypes();
		System.out.println("NSGV:"+ ref);
		ref.salary=35000.00;
		System.out.println("NSGV:"+ ref.salary);
		

	}

}
