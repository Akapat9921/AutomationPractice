package practisedaily;
class Animal{
	String color = "White of Red";
}
class Dog extends Animal{
	String color = "Black";
	void printcolor() {
		System.out.println("Dog color is: "+color);//prints color of Dog class
		Animal ref = new Animal();
		System.out.println("Animal color is: "+ref.color);
		                    //or
		System.out.println("Animal color is: "+super.color);//prints color of Animal class
	}
	
}

public class SuperKeyword1 {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.printcolor();
		

	}

}
/*
super keyword: is an instance of immediate parent class
	which will help us to access parent class non-static member from child class when they have 
	common name.


*/
