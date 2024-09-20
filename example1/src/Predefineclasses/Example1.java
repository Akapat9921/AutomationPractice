package Predefineclasses;
class Demo{
	void display() {
		System.out.println("I am display method of demo class");
	}
}

public class Example1 extends Demo {

	public static void main(String[] args) {
		Example1 ref1 = new Example1();
		System.out.println("ref1 with explicit toString(): "+ref1.toString());
		System.out.println("ref1 address with hashcode(): "+ref1.hashCode());

		 Example1 ref2 = new Example1();
		 System.out.println("ref2 without(implicit) toString(): "+ref2);
		 System.out.println("ref2 addresss with hashcode(): "+ref2.hashCode());
		 System.out.println("camparing ref2 with ref1 based adderess: "+ref1.equals(ref2));
	}

}


/*
Object class: 
	parent most/super most class in java, directly or indirectly inherited by all java classes mainly
	created by programmer
	this class belongs to java.lang package that will by default available in each java hence no need to import it
	
	toString(): give string representation of java object
			fullyqualifiedclassname@hexadecimaladdress
			return type: String
			access modifier: public
	
	equals(Object obj): use to compare two objects based on address
			return type: boolean
			access modifier: public
	
	hashCode(): help us to convert hexadecimaladdress into number
			return type: int
			access modifier: public
*/
