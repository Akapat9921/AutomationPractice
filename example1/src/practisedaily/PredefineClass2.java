package practisedaily;
class Demo00{
	void Display() {
		System.out.println("I am display of demo class");
	}
}

public class PredefineClass2 {

	public static void main(String[] args) {
		Demo00 d1 = new Demo00();
		System.out.println("d1 without (implicit) tostring(): "+d1);
		System.out.println("d1 address with hashcode():"+d1.hashCode());
		Demo00 d2 = new Demo00();
		System.out.println("d2 without (implicit) toString(): "+d2);
		System.out.println("d2 address with hashcode: "+d2.hashCode());
		System.out.println("camparing d1 with d2 based on address: "+d1.equals(d2));
		
		PredefineClass2 ref1 = new PredefineClass2();
		System.out.println("ref1 without (implicit) toString: "+ref1);
		System.out.println("ref1 address with hashcode():"+ref1.hashCode());
		PredefineClass2 ref2 = new PredefineClass2();
		System.out.println("ref2 with toString :"+ref2.toString());
		System.out.println("ref2 address with hashcode(): "+ref2.hashCode());
		System.out.println("camparing ref1 with ref2 based on address: "+ref1.equals(ref2));
		
		
	}

}
