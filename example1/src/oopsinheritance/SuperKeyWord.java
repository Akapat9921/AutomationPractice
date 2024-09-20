package oopsinheritance;
class Animal{
	String colour = "White of red";
}
class Dog6 extends Animal{
	String colour = "Black";
	void printcolour() {
		System.out.println("Dog colour is: "+colour);//prints colour of dog class
		//Animal ref = new Animal();
		//System.out.println("Animal colour is: "+ref.colour);
		//or
		System.out.println("Animal colour is: "+super.colour);//prints colour of Animal class
	}
}

public class SuperKeyWord {


	public static void main(String[] args) {
		Dog6 d = new Dog6();
		d.printcolour();

	}

}
