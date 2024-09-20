package practisedaily;
//single level inheritance
class vehicle{
	public void tructVehicle() {
		System.out.println("Truck is having 8 wheels");
	}
}
class car extends vehicle{
	public void carwl() {
		System.out.println("Car is having 4 wheels");
	}
}

public class Inheritance1 {
    public void bikewl() {
    	System.out.println("bike is having two wheels");
    }
	public static void main(String[] args) {
		vehicle v1 = new vehicle();
		v1.tructVehicle();
		car c1 = new car();
		c1.carwl();
		c1.tructVehicle();
		Inheritance1 obj1 = new Inheritance1();
		obj1.bikewl();
		

	}

}
