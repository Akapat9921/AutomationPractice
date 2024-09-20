package oopsinheritance;
class vehical{ //parent class
	public void wheels() {
		System.out.println("I have wheels");
	}
}
//first child class of vehical
class bike extends vehical{ 
	public void countwl() {
		System.out.println("i am bike and i have two wheels");
	}
}
//second child class of vehical
class car1 extends vehical{
	public void countwlc() {
		System.out.println("I am car and has 4 wheels");
	}
}
//third child class of vehical
class scooter extends vehical{
	public void countwls() {
		System.out.println("I am scooter and has two wheels");
	}
}
public class inheritance5 {
	
	public static void main(String[] args) {
		car1 c = new car1();//object of car class
		c.wheels();
		c.countwlc();
		bike b = new bike();// object of buke class
		b.wheels();
		b.countwl();
		scooter sc = new scooter();//object of scooter class
		sc.wheels();
		sc.countwls();

	}

}
