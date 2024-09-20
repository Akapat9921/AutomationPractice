package Predefineclasses;
class Demo1{
	void display() {
		System.out.println("I am display of demo1");
	}
}

public class Exaple2 {

	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		System.out.println("d1 without (implicit) toString: "+d1);
		System.out.println("d1 address with hashcode(): "+d1.hashCode());
		Demo1 d2 = new Demo1();
		System.out.println("d2 without (implicit) toString: "+d2);
		System.out.println("d2 address with hashcode(): "+d2.hashCode());
		System.out.println("Comparing d1 and d2 based on address: "+d1.equals(d2));
		
		Exaple2 ref1 = new Exaple2();
		System.out.println("ref1 without (implicit) toString(): "+ref1);
		System.out.println("ref1 address with hashcode(): "+ref1.hashCode());
		
		Exaple2 ref2 = new Exaple2();
		System.out.println("ref2 without (implicit) toString(): "+ref2);
		System.out.println("ref2 address with hashcode(): "+ref2.hashCode());
		System.out.println("comparing ref1 with ref2 based adresss: "+ref1.equals(ref2));
	}
	public boolean equals(Object obj) {
		return true;
	}
	public String toString() {
		return "Hello";
	}
	public int hashcode() {
		return 101;
	}

}
