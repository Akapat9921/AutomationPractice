package practisedaily;
class Animal2{
	void eat() {
		System.out.println("eat of animal2 class");
	}
}
class Dog2 extends Animal2{
	void eat() {
		System.out.println("eat of dog2 class");
	}
	void bark() {
		System.out.println("bark of dog2 class");
	}
	void work() {
		bark();
		eat();
		System.out.println("Work of Dog2 class");
		System.out.println("************************");
		Animal2 ref = new Animal2();
		ref.eat();
		  //or
		super.eat();
	}
}

public class SuperKeyword2 {

	public static void main(String[] args) {
		Dog2 d2 = new Dog2();
		d2.work();
		
	}

}
