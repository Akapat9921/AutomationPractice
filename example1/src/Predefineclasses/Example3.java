package Predefineclasses;
class sample{
	int age=101;
	void display() {
		System.out.println("Displaying age of sample class: "+age);
	}
}

public class Example3 {
	static sample ref= new sample();

	public static void main(String[] args) {
		Example3.calling();
		
//		sample ref = new sample();
//		ref.display();
		Example3.ref.display();
		//classname.staticReferanceVariableOfSample.nonstaticMethodOfSample
		System.out.println("Hello");
		System.err.println("Bye");
	//classname.staticReferanceVariableOfPrintStream.nonstaticMethodOfPrintStream


	}
	static void calling() {
		System.out.println("Calling from example3");
	}

}
