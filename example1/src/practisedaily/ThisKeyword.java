package practisedaily;

public class ThisKeyword {
	int age;// non static diff

	public static void main(String[] args) {
		System.out.println("Program starts");
		ThisKeyword ref = new ThisKeyword();
		ref.print();
		System.out.println("Value of ref: "+ref);
		System.out.println("Program ends");
		

	}
	void print() {
		System.out.println("Print merhod started");
		System.out.println("age: "+age);
		int age = 25;
		System.out.println("age:"+age);
//		ThisKeyword n1 = new ThisKeyword ();
//		System.out.println("NSGV age:"+n1.age);
		
		//or
		System.out.println("NSGV age: "+this.age);
		System.out.println("Value of this keyword: "+this);
		System.out.println("Print method ends");
		
	}

}
