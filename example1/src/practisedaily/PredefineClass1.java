package practisedaily;
class Demo07{
	void Display() {
		System.out.println("I am display of demo class");
	}
}

public class PredefineClass1 extends Demo07  {

	public static void main(String[] args) {
		PredefineClass1 ref1 = new PredefineClass1();
		System.out.println("ref1 with explicit tostring(): "+ref1.toString());
		System.out.println("ref1 addres  with hashcode():"+ref1.hashCode());
		PredefineClass1 ref2 = new PredefineClass1();
		System.out.println("ref2 without tostring(): "+ref2);
		System.out.println("ref2 address with hashcode(): "+ref2.hashCode());
		System.out.println("comparing ref1 and ref2 based address: "+ref1.equals(ref2));
		
		PredefineClass1 ref3 = new PredefineClass1();
		System.out.println("ref3 without tostring(): "+ref3);
		System.out.println("ref3 address with hascode(): "+ref3.hashCode());
		System.out.println("comparing ref2 with ref3 based on address: "+ref2.equals(ref3));
	}

}
 