package practisedaily;
interface i1{
	
}
interface Drawable{
	int salary = 25000;
	void draw();
}
class rectangle implements Drawable{
	public void draw() {
		System.out.println("Drawing rectangle");
	}
}
class Circle implements Drawable{
	public void draw() {
		System.out.println("Drawing circle");
	}
}
public class Interface1 {

	public static void main(String[] args) {
		System.out.println("Interface variable salary: "+Drawable.salary);
		rectangle r1 = new rectangle();
		r1.draw();
		Circle c1 = new Circle();
		c1.draw();
		Drawable d = new Circle();
		d.draw();
	}

}
