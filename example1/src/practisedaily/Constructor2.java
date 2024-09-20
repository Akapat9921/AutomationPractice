package practisedaily;

public class Constructor2 {
	Constructor2(int x){
		System.out.println("I am int param cons");
		age=x;
	}
	int age;
	void display() {
		System.out.println("i am display method of Constructor2 class");
	}

	public static void main(String[] args) {
		Constructor2 obj1 = new Constructor2(55);
		System.out.println(obj1.age);
		obj1.display();
		System.out.println("***********************");
		Constructor2 obj2 = new Constructor2(10);
		System.out.println(obj2.age);
		obj2.display();

	}

}
