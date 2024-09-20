package Practice;
interface Jack{
	public void Rubby();
	public void Raj() ;
	
	}
class Will implements Jack{
	public void Rubby() {
		System.out.println("I am rubby of will");
	}
	public void Raj() {
		System.out.println("i am raj of will");
	}
	public void Chang() {
		System.out.println("I am chang of will");
	}
}
class Rahul implements Jack{
	public void Rubby() {
		System.out.println("I am rubby of rahul");
	}
	public void Raj() {
		System.out.println("I am Raj of rahul");
	}
	public static void Prem() {
		System.out.println("I am prem of Rahul");
	}
}

public class DemoClass1 {

	public static void main(String[] args) {
		Will w1 = new Will();
		w1.Rubby();
		w1.Raj();
		w1.Chang();
		Jack j1 = new Rahul();
		j1.Rubby();
		j1.Raj();
		

	}

}
