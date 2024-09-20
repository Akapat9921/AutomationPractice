package Thisstate;

public class nonstaticdiff {
	int age; // non static global variable

	public static void main(String[] args) {
		System.out.println("Program starts:");
		nonstaticdiff ref = new nonstaticdiff();
		ref.print();
		System.out.println("Program ends.");

	}
	void print() {
		System.out.println("print method started");
		System.out.println("age: "+age);
		int age = 25;
		System.out.println("age: "+age);
		
		//nonstaticdiff n1 = new nonstaticdiff();
		//System.out.println("NSGV age: "+ age);
		//or
		System.out.println("NSGV age: "+this.age);
		System.out.println("value of this keyword: "+this);
		System.out.println("print method ends");
		
	}

}
