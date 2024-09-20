package practisedaily;

public class Constructor1 {
	//user defined constructor
	Constructor1(){
		System.out.println("I am zero param cons...");
		age = 35;
	}
	int age;
	void display() {
		System.out.println("I am display method of constructor1 class");
	}

	public static void main(String[] args) {
		Constructor1 ref = new Constructor1();
		System.out.println(ref.age);
		ref.display();

	}

}
