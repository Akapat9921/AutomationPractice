package Practice;
class Dem{
	void Display() {
		System.out.println("I am display of demo class");
	}
}

public class PredefineClass1 extends Dem {

	public static void main(String[] args) {
		PredefineClass1 ref1 = new PredefineClass1();
		System.out.println("ref1 with explicit ToString(): "+ref1.toString());
		System.out.println("ref1 address with hashcode(): "+ref1.hashCode());
		PredefineClass1 ref2 = new PredefineClass1();
		System.out.println("ref2 without implicit toString: "+ref2);
		System.out.println("ref2 address with hashcode: "+ref2.hashCode());
		System.out.println("Comparing ref1 with ref2 based address: "+ref1.equals(ref2));

		PredefineClass1 ref3 = ref2;
		System.out.println("ref3 without implicit toString: "+ref3);
		System.out.println("ref3 address with hashcode(): "+ref3.hashCode());
		System.out.println("comparing ref2 with ref3 based address: "+ref2.equals(ref3));
	}
	void calling() {
		System.out.println("calling from predefineclass");
	}

}
