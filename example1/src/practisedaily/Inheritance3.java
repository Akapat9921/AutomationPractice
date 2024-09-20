package practisedaily;
class GrandFather{
	public void farm10() {
		System.out.println("Grandpaa has Farm.");
	}
}
class Father extends GrandFather{
	public void house10() {
		System.out.println("Father has house.");
	}
}
class Son extends GrandFather{
	public void bike10() {
		System.out.println("Son has bike.");
	}
}
public class Inheritance3 {
	public void tv() {
		System.out.println("I have tv.");
	}

	public static void main(String[] args) {
		GrandFather G1 = new GrandFather();
		G1.farm10();
		Father F1 = new Father();
		F1.house10();
		F1.farm10();
		Son S1 = new Son();
		S1.bike10();
		S1.farm10();
		GrandFather G = new Father();
		G.farm10();
		
		

	}

}
