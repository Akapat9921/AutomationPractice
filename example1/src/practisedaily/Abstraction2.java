package practisedaily;
abstract class train{
	abstract void trainTicket() ;
	public void plane() {
		System.out.println("I am Cargo plane");
	}
	
}
class bulletTrain extends train{
	public void trainTicket() {
		System.out.println("Bullet train ");
		
		}
	public void passengerPlane() {
		System.out.println("I am Passenger plane");
	}
}
class localTrain extends train{
	public void trainTicket() {
		System.out.println("Local train");
	}
	public void fiterPlane() {
		System.out.println("I am fiter plane");
	}
}

public class Abstraction2 {

	public static void main(String[] args) {
		bulletTrain b1 = new bulletTrain();
		b1.passengerPlane();
		b1.plane();
		b1.trainTicket();
		train b2 = new bulletTrain();
		b2.plane();
		b2.trainTicket();
		localTrain t1 = new localTrain();
		t1.trainTicket();
		t1.fiterPlane();
		t1.plane();
		

	}

}
