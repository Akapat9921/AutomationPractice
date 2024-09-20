package practisedaily;
class city{
	public void banglore() {
		System.out.println("My city is Banglore");
	}
}
class TCS extends city{
	public void emp() {
		System.out.println("I am TCS employee");
	}
}
class worker extends TCS{
	public void raj() {
		System.out.println("Hi, I am Raj");
	}
}

public class Inheritance2 {
	public void food() {
		System.out.println(" I like vegiterian food.");
	}

	public static void main(String[] args) {
		city c1 = new city();
		c1.banglore();
		TCS t1 = new TCS();
		t1.emp();
		t1.banglore();
		worker w1 = new worker();
		w1.raj();
		w1.emp();
		w1.banglore();
		Inheritance2 obj = new Inheritance2();
		obj.food();
//		city c2 = new TCS();
//		c2.banglore();
//		city c3 = new worker();
//		c3.banglore();

	}

}
