package Abstraction;
abstract class vehicle{ //abstract class
 public abstract void vehicleType();//abstract method
	public void cycle() {//normal method
		System.out.println("cycle has two wheels");
	}
}
class car5 extends vehicle{
	public void vehicleType() {
	System.out.println("Car has four wheels");
	
}
}
class bike5 extends vehicle{
	public void vehicleType() {
		System.out.println("Bike has two wheels");
	}
}

public class Abstraction2 {

	public static void main(String[] args) {
		car5 c1 = new car5();
		c1.cycle();
		c1.vehicleType();
		bike5 b1 = new bike5();
		b1.cycle();
		b1.vehicleType();
		
		
	}

}
