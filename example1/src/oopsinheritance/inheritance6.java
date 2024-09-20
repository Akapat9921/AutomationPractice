package oopsinheritance;
//super class/ base class/ parent class
class Grandfather {
	Grandfather(){
		System.out.println("I am class grandfather cons...");
		
	}
	void myHome() {
		System.out.println("I am home of grandfather");
	}
	
}
//subclass/child class/ derived class
class Father extends Grandfather{
	Father(double d){
		//super(); //if we dont write this then java compiler will write it
		System.out.println("I am class father cons...");
	}
	void myCar() {
		System.out.println("I am car of father");
	}
}
class Child1 extends Father{
	Child1(int i){
		super(12.34);
		System.out.println("I am class child cons...");
	}
	void myBike() {
		System.out.println("I am bike of Child");
	}
}
public class inheritance6 {

	public static void main(String[] args) {
		System.out.println("***************************************");
		Child1 c1 = new Child1(21);// home, car , bike
		c1.myHome();
		c1.myCar();
		c1.myBike();
		System.out.println("***************************************");
		//creating an object or instance of child most class and reffered by its parent
		Father f1 = new Father(254.1);
		f1.myHome();
		f1.myCar();
		System.out.println("****************************************");
		Grandfather gf = new Grandfather();
		gf.myHome();

	}

}
