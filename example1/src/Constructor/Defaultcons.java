package Constructor;

public class Defaultcons {
	//default constructor
	int age;
	void display() {
		System.out.println("I am display the method of Defaultcons class");
	}

	public static void main(String[] args) {
		Defaultcons ref = new Defaultcons();
		System.out.println(ref.age);
		ref.display();
		

	}

}
