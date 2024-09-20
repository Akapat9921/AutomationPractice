package practisedaily;
class Sample{
	private Sample() {
		System.out.println("I am private cons of sample class");
	}
	static Sample s1 = new Sample();
	public static Sample getInstance() {
		return s1;
	}
	int age;
	void calling() {
		System.out.println("I am calling method of sample class and age is: "+age);
	}
}

public class SingletonClass {

	public static void main(String[] args) {
		Sample ref = Sample.getInstance();
		ref.calling();
		ref.age = 25;
		
		Sample ref2 = Sample.getInstance();
		ref2.calling();

	}

}
/*
To Create Singleton class refer below points:
	Create class constructor as private
	Create static private instance of current class
	Create static method which should returns object of current class

*/
