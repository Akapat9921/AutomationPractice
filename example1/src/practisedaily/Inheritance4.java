package practisedaily;
class cellPhone{
	public void phoneType() {
		System.out.println("I have Nokia Android phone");
	}
	public void Airtel() {
		System.out.println("I have Airtel sim");
	}
}
class samsung extends cellPhone{
	public void phonetype() {
		System.out.println("I have samsung Android phone");
	}
	void Idea() {
		System.out.println("I have Idea sim");
	}
}
class iPhone extends cellPhone{
	//@override
	public void phoneType() {
		System.out.println("I have IPhone");
	}
	protected void Jio() {
		System.out.println("I have jio sim");
	}
}

public class Inheritance4  extends cellPhone{
	public void phoneType() {
		System.out.println("I have One plus.");
	}

	public static void main(String[] args) {
		System.out.println("Program starts:");
		cellPhone ph = new cellPhone();// parent class only access its own members
		ph.phoneType();
		ph.Airtel();
		//now creating object of child class samsung
		samsung sm = new samsung();// samsung class also access the members of parent class
		sm.phonetype();
		sm.Idea();
		sm.Airtel();
		//now giving reference of parent class and creating object of samsung class
		cellPhone ph1 = new samsung();// no method overriding thatswhy it is printing phonetype method of parrnt class only
		ph1.phoneType();
		ph1.Airtel();
		//now giving reference of parent class and creating object of iphone class
		cellPhone ph2 = new iPhone();
		ph2.Airtel();
		ph2.phoneType();// here bcoz of method overriding phoneType method of iphone class i.e. child class is getting printed
		

	}

}
