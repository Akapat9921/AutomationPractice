package practisedaily;
abstract class iceCream{
	public abstract void venilla();
	public void candy() {
		System.out.println("I am chocklate candy.");
	}
}

class Ice extends iceCream {
	public void venilla() {
		System.out.println("I am venilla of Ice class");
	}
	public void blueberry() {
		System.out.println("I am blueberry");
	}
}
class Water extends iceCream{
	public void venilla() {
		System.out.println("I am venilla of Water class");
	}
	public void cherry() {
		System.out.println("I am cherry of water class");
	}
}
	


public class Abstraction6 {

	public static void main(String[] args) {
	//	iceCream = new iceCream ();// can not create object of abstract class
		Ice i = new Ice();
		i.venilla();
		i.blueberry();
		i.candy();
		Water w = new Water();
		w.cherry();
		w.venilla();
		w.candy();
		iceCream obj = new Ice();// its called upcasting
		obj.candy();
		obj.venilla();
		

	}

}
