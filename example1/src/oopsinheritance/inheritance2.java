package oopsinheritance;
class demo3 {
	//default constructor
	static int age1 = 25;
	double salary1 = 45000.52;
	void calling() {
		System.out.println("I am calling of demo3 class");
	}
}
class demo4 extends demo3{
	//default constructor with default super
	static int age2 = 45;
	double salary2 = 25000.32;
	void print() {
		System.out.println("i am print of demo4 class");
	}
}

public class inheritance2 extends demo4{
	//default constructor with default super()
     static int num1 = 25;
     void display() {
    	 System.out.println("I am display method of inheritance2 class");
     }
	
	public static void main(String[] args) {
		//accessing static members using class name
		System.out.println("demo3 class age variable:"+demo3.age1);
		System.out.println("demo 4 class age variable:"+demo4.age2);
		System.out.println("inheritance2 class num variable:"+inheritance2.num1);
		
		//creating instance of child most class i.e. inheritance2
		inheritance2 ref1 = new inheritance2();
		ref1.calling();
		ref1.print();
		ref1.display();
		System.out.println("Access demo3 class, NSGV salary1 using child class ref:"+ref1.salary1);
		System.out.println("access demo4 class, NSGV salary2 using child class ref:"+ref1.salary2);
		

	}

}
