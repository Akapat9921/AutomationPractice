package oopsinheritance;
class ABC{
	void myMethod() {
		System.out.println("Method of ABC class");
	}
}

public class Overriding4 extends ABC{
public void myMethod() {
	//this will call the myMethod() of parent class
	super.myMethod();
	System.out.println("overriding method of class overriding4");
}
	public static void main(String[] args) {
		Overriding4 obj = new Overriding4();
		obj.myMethod();
	}

}
