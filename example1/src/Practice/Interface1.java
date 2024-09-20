package Practice;
interface Demo2{
	double salary=25000;
	void Write();
}
class Read implements Demo2{
	public void Write() {
		System.out.println("I am write of Read class");
	}
	public void Learn() {
		System.out.println("I am learning testing");
	}
}

class Man implements Demo2{
	public void Write() {
		System.out.println("I am write of Man");
	}
	public void Body() {
		System.out.println("I am body of Man");
	}
}
public class Interface1 {

	public static void main(String[] args) {
		Read r1 = new Read();
		r1.Write();
		r1.Learn();
		Man m1 = new Man();
		m1.Write();
		m1.Body();
		Demo2 d1 = new Read();
		d1.Write();
		System.out.println(d1.salary);

	}

}
