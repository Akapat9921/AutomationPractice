package practisedaily;
abstract class Sea{
	public abstract void ArebianSea();
	public void rever() {
		System.out.println("I am Ganga rever.");
	}
	
	
}
class India007 extends Sea{
	public void ArebianSea() {
		System.out.println("I am Arebian sea");
		
	}
	public void IndianOcean() {
		System.out.println("I am Indian Ocen");
	}
}
class Desert extends Sea{
	public void ArebianSea() {
		System.out.println("I am sea of desert class");
	}
	public void Sahara() {
		System.out.println("I am Sahara desert");
	}
}

public class Abstraction5 {

	public static void main(String[] args) {
		//Sea s1 = new sea();// Abstract class object cannot be created
		India007 a9 = new India007();
		a9.ArebianSea();
		a9.IndianOcean();
		a9.rever();

	}

}
