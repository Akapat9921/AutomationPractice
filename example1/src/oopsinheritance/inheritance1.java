package oopsinheritance;
class demo1{
	static int age1 = 25;
	double salary1 = 45000.52;
	void calling() {
		System.out.println("I am calling of demo1 class.");
	}
}
class demo2{
	static int age2 = 45;
	double salary2 = 55000.52;
	void print() {
		System.out.println("I am print of demo2 class.");
	}
}

public class inheritance1 {
      static int num1 = 25;
      void display () {
    	  System.out.println("I am display method of inheritance1 ");
      }
	public static void main(String[] args) {
		//accessing static members using class name
		System.out.println("Demo1 class age variable: "+demo1.age1);
		System.out.println("Demo2 class age variableis:"+demo2.age2);
		System.out.println("inheritance1 class num variable is:"+inheritance1.num1);
		
		//accessing not static members
		demo1 ref1 = new demo1();
		System.out.println("demo1 class salary variable:"+ref1.salary1);
		ref1.calling();
		demo2 ref2 = new demo2();
		System.out.println("demo2 class salary variable is:"+ref2.salary2);
		ref2.print();
		inheritance1 ref3 = new inheritance1 ();
		ref3.display();
	}

}
