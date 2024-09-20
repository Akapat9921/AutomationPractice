package practisedaily;

public class Practice3 {
	//Constructor chaining
	Practice3(){
		System.out.println("i am zero param cons");
	}
	Practice3(int a){
		this();
		System.out.println("I am param cons");
		System.out.println(" having int param...");
		System.out.println("Value of param a is: "+a);
	}
	Practice3(double b, int c){
		this(100);
		System.out.println("I am having two param...");
		System.out.println("Value of double is: "+b);
		System.out.println("Value of int is: "+c);
	}
	Practice3(int d, double y, double z){
		this(22.22,44);
		System.out.println(" am having three params....");
	}

	public static void main(String[] args) {
		System.out.println("Program starts:");
		//Practice3 obj = new Practice3();
		//Practice3 obj1 = new Practice3(10);
	//	Practice3 obj2 = new Practice3(456.25,20);
		Practice3 obj3 = new Practice3(15,4500.10,5556.23);
		
		
	}

}
