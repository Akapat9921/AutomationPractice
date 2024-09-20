package Constructor;

class demo {
	static int age = 25;

	void calling() {
		System.out.println("I am calling the method of demo class.");
	}
}

public class Constructorbasic1 {
	double salary = 45000.56;

	static void display() {
		System.out.println("I am display method of Constructorbasic1 class.");
	}

	public static void main(String[] args) {
		System.out.println("static global variable of demo class age is:" + demo.age);
		Constructorbasic1.display();

		demo ref = new demo();
		ref.calling();

		Constructorbasic1 e1 = new Constructorbasic1();
		System.out.println("Non static global variable of class Constructorbasic1 salary is:" + e1.salary);

	}

}
