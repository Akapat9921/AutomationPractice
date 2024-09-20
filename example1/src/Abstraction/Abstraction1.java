package Abstraction;
abstract class Animal{
	// Abstract method (does not have a body)
	public abstract void animalSound();
	//Regular method
	public void sleep() {
		System.out.println("zzz");
	}
}
//Subclass (inherit from Animal)

class pig extends Animal{
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("the pig says: wee wee");
	}
}
class Dog8 extends Animal{
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The dog says: bow bow");
	}
}

public class Abstraction1 {

	public static void main(String[] args) {
		pig mypig = new pig();
		mypig.animalSound();
		mypig.sleep();
		Dog8 d1 = new Dog8();
		d1.animalSound();
		d1.sleep();
		

	}

}
