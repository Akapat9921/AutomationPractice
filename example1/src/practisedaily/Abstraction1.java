package practisedaily;
abstract class bike01{
	abstract void run();
	void speed(int spd) {
		System.out.println("Bike speed: "+spd);
	}
}
class honda01 extends bike01{
	void run() {
		System.out.println("running safely");
	}
	void color() {
		System.out.println("Honda has black color");
	}
	
}

public class Abstraction1 {

	public static void main(String[] args) {
		honda01 ref = new honda01();
		ref.color();
		ref.run();
		ref.speed(78);
		bike01 b1 = new honda01();
		b1.run();
		b1.speed(67);

	}

}
