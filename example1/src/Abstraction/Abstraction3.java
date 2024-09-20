package Abstraction;
abstract class Bike1{
	abstract void run();
	void speed(int spd) {
		System.out.println("Bike speed:"+spd);
		
	}
}
class Honda extends Bike1{
	void run() {
		System.out.println("Running safely");
	}
	void color() {
		System.out.println("Honda color is black");
	}
}
public class Abstraction3 {

	public static void main(String[] args) {
		Honda obj = new Honda();
		obj.run();
		obj.color();
		obj.speed(250);
		Bike1 b2 = new Honda();
		b2.run();
		b2.speed(400);

	}

}
