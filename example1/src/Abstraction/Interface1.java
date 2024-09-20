package Abstraction;
interface i1{
	
}
//interface declaration
interface Dreawable{
	int salary = 25000;// by default---> public static final int salary = 25000;
	void draw();//by default -----> public abstract void draw();
	
}

//implementation by second user
class Rectangle1 implements Dreawable{
	public void draw() {
		System.out.println("Drawing rectangle");
	}
}
class circle implements Dreawable{
	public void draw() {
		System.out.println("drawing circle");
	}
}
public class Interface1 {
	public static void main(String[] args) {
		System.out.println("Interface variable salary: "+Dreawable.salary);
		Rectangle1 r1 = new Rectangle1();
		r1.draw();
		circle c1 = new circle();
		c1.draw();
		Dreawable d = new circle();
		d.draw();

	}

}
