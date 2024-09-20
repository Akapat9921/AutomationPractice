package Practice; 
class Demo{
	static void Run() {
		System.out.println("I am run of parent class");
	}
	static void Fast() {
		System.out.println("I am fastest");
	}
}
class Child extends Demo{
	static void run() {
		System.out.println("I am run of child class");
	}
	static void Fruit() {
		System.out.println("I am Apple");
	}
}
class Sun extends Demo{
	static void Run() {
		System.out.println("I am run of sun");
	}
	static void Car() {
	System.out.println("I am car of sun");
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.Run();
		obj.Fast();
		Child obj1 = new Child();
		obj1.run();
		obj1.Fruit();
		obj1.Fast();
		Sun obj2 = new Sun();
		obj2.Car();
		obj2.Fast();
		obj2.Run();
		Demo d1 = new Sun();
		d1.Run();
		d1.Fast();
		

	}

}
