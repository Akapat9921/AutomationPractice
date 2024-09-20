package Polymorphism;
class Bank{
	public float getRateOfInterest() {
		return 5.5f;
	}
}
class SBI extends Bank{
	public float getRateOfInterest() {
		return 6.5f;
	}
}
class ICICI extends Bank{
	public float getRateOfInterest() {
		return 6.8f;
	}
}
class AXIS extends Bank{
	public float getRateOfInterest() {
		return 7.5f;
	}
}

public class RunTimePoly2 {

	public static void main(String[] args) {
		Bank s1 = new SBI();
		
		System.out.println("SBI rate of interest is: "+s1.getRateOfInterest());
		Bank s2 = new ICICI();
		System.out.println("ICICI rate of interest is: "+s2.getRateOfInterest());
		Bank s3 = new AXIS(); 
		System.out.println("AXIS rate of interest is: "+s3.getRateOfInterest());
	}

}
