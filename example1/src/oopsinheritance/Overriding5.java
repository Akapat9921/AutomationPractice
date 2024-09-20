package oopsinheritance;
//base class, parent class
class Parent{
	void show() {
		System.out.println("Parent show()");
	}
}
//inheritated class
class child extends Parent{
	//this method overrides show() of parent
	//@Override
	void show() {
		System.out.println("childs show()");
	}
 }
//driver class
public class Overriding5 {

	public static void main(String[] args) {
		//If a Parent type reference refers to a Parent object, then Parent's show is called
		Parent obj = new Parent();
		obj.show();// Parents show()
		// If a Parent type reference refers to a Child object Child's show() is called. This is called RUN TIME
				// POLYMORPHISM.
      Parent obj2 = new child();
      obj2.show();// childs show()
	}

}
