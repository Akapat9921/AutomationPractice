package Practice;
abstract class Water{
	abstract void blue ();
	void red() {
		System.out.println("I am red of water class");
	}
			
}
class Sand extends Water{
	void blue() {
		System.out.println("I am blue of sand class");
	}
	public void brown() {
		System.out.println("Sand color is brown");
	}
}
class Grass extends Water{
	void blue() {
		System.out.println("I am blue of Grass class");
	}
	public void green() {
		System.out.println("Graas is green color");
	}
}

public class Abstraction1 {

	public static void main(String[] args) {
		Sand s1 = new Sand();
		s1.blue();
		s1.brown();
		s1.red();
		Grass g1 = new Grass();
		g1.blue();
		g1.green();
		g1.red();
		Water w1 = new Sand();
		w1.blue();
		w1.red();

	}

}
