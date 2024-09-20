package oopsinheritance;
class demo5{
	//default cons
	static int age1 = 25;
	double salary1 = 45000.52;
	void calling () {
		System.out.println("i am calling method of demo5 class");
	}
}
class demo6 extends demo5{
	demo6(int num){
		//default super
		System.out.println("i am demo6 cons");
	}
	static int age2 = 45;
	double salary2 =25000;
	void print() {
		System.out.println("I am print of demo6");
	}
}

public class inheritancesuper extends demo6 {
	//default cons with default super()
     inheritancesuper(){
    	 super(25);
    	 System.out.println("inheritancesuper cons");
     }
     static int num1 = 25; 	
     void display() {
    	 System.out.println("I am display method of inhsuper class");
     }
	public static void main(String[] args) {
		//accessing static members using class name
		System.out.println("demo5 class age variable:"+demo5.age1);
		System.out.println("demo6 class age variable:"+demo6.age2);
		System.out.println("super class num variable:"+inheritancesuper.num1);
		
		//creating an instance of child most class i.e. inheritancesuper
		inheritancesuper ref1 = new inheritancesuper();
		ref1.calling();
		ref1.print();
		ref1.display();
		System.out.println("Access demo5 class NSGV salary:"+ref1.salary1);
		System.out.println("Access demo6 class NSGV salary:"+ref1.salary2);
	}

}
