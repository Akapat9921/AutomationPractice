package Constructor;

public class nonstaticmethod {
	int age;// non static global variable

	public static void main(String[] args) {
		System.out.println("Program starts:");
		nonstaticmethod ref = new nonstaticmethod ();
		ref.print();
		System.out.println("program ends.");
		

	}
	void print() {
		System.out.println("Print method started");
		System.out.println("age:"+age);
		int age = 25;
		System.out.println("age: "+age);
		
		//nonstaticmethod n1 = new nonstaticmethod ();
		//System.out.println("NSGV age: "+ n1.age);
		//or
		System.out.println("NSGV age: "+this.age );
		
		System.out.println("Print method ends.");
	}
     
}
