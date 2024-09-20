package oopsinheritance;
class Animal2{
	public void move() {
		System.out.println("Animal can move");
	}
	void display() {
		System.out.println("I am display method of animal2 class");
	}
}
class dog2 extends Animal2{
	public void move() {
		System.out.println("Dogs can walk and run");
		display();
		//Animal2 a1 = new Animal2();
		//a1.move();
		super.move();
	}
}

public class Overriding2 {

	public static void main(String[] args) {
		Animal2 a2 = new dog2();
		a2.move();
	}

}
