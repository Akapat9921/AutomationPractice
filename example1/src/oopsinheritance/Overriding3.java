package oopsinheritance;
class Human{
	void eat() {
		System.out.println("Human is eat");
	}
}
class Boy extends Human{
	//overriding method
	public void eat() {
		System.out.println("Boy is eating");
	}
}
public class Overriding3 {

	public static void main(String[] args) {
		Boy obj = new Boy();
		obj.eat();
	}

}
