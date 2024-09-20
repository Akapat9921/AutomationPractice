package Polymorphism;
class Demo{
	void calling() {
		System.out.println("Calling from demo class");
	}
}


public class RunTimePoly extends Demo {
	void calling() {
		System.out.println("calling from runtimepoly");
	}

	public static void main(String[] args) {
		RunTimePoly r1 = new RunTimePoly ();
		r1.calling();
		Demo d1 = new Demo();
		d1.calling();
		Demo d2 = new RunTimePoly ();//runtime polymorphism
		d2.calling(); 
		
	}

}
