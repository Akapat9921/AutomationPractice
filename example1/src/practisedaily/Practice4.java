package practisedaily;
//Multi-level inheritance
class Tomato{
	public void chily() {
		System.out.println("I am chily of tomato class.");
	}
	public void capsicum() {
		System.out.println("I am Yellow capsicum");
	}
}
class Beans extends Tomato{
	public void rice() {
		System.out.println("I am rice of Beans");
	}
	public void ginger() {
		System.out.println("I am ginger");
	}
}
class GroundNuts extends Beans{
	public void wheet() {
		System.out.println("I am wheet.");
	}
}

public class Practice4 {

	public static void main(String[] args) {
		Tomato t1 = new Tomato();
		t1.chily();
		t1.capsicum();
		Beans b1 = new Beans();
		b1.chily();
		b1.capsicum();
		b1.ginger();
		b1.rice();
		GroundNuts g1 = new GroundNuts();
		g1.wheet();
		g1.rice();
		g1.ginger();
		g1.chily();
		g1.capsicum();
		Tomato obj = new Beans();// upcating || polymorphism
		obj.capsicum();
		obj.chily();
		Tomato obj1 = new GroundNuts();// upcating  || polymorphism
		obj1.capsicum();
		obj1.chily();
		

	}

}
