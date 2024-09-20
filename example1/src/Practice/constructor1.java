package Practice;

public class constructor1 {
  constructor1(int a){
	  System.out.println("I am having int param...");
	  System.out.println("Value of a is: "+a);
  }
  constructor1(double salary, int b){
	  this(99);
	  System.out.println("I am having two param...");
	  System.out.println("Value of salary is: "+salary);
	  System.out.println("Value of b is: "+b);
  }
  constructor1(int z, double d, int x){
	  this(44500.36,88);
	  System.out.println("I having three param...");
	  System.out.println("value of z is: "+z);
	  System.out.println("value of d is: "+d);
	  System.out.println("value of x is: "+x);
  }
  
 

	public static void main(String[] args) {
		//constructor1 obj1 = new constructor1(22);
		//constructor1 obj2 = new constructor1(15000.52,50);
		constructor1 obj3 = new constructor1(10,100.25,45);
		

	}

}
