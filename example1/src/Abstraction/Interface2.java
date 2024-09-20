package Abstraction;
interface Bank{
	float rateOfInterest();//by default ----> 
}
class SBI implements Bank{
	public float rateOfInterest() {
		return 9.15f;
	}
}
class PNB1 implements Bank{
	public float rateOfInterest() {
		return 9.30f;
	}
}

public class Interface2 {

	public static void main(String[] args) {
		SBI s1 = new SBI();
		System.out.println("SBI ROI: "+s1.rateOfInterest());
        PNB1 p1 = new PNB1();
        System.out.println("PNB ROI: "+p1.rateOfInterest());
        Bank b1 = new SBI();
        System.out.println("ROI: "+b1.rateOfInterest());
	}

}
