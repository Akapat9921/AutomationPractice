package practisedaily;

public class ConstructorChaining {
	ConstructorChaining(int a){
		System.out.println("Cons having int param");
		System.out.println("Value of a is:"+a);
	}
	ConstructorChaining(int b, double c){
		this(35);
		System.out.println("cons having int and double param");
		System.out.println("value of b is :"+b);
		System.out.println("Value of c is:"+c);
	}
	ConstructorChaining(double x, double y){
		this(22,55.5);
		System.out.println("cons having both double param");
		System.out.println("vaule of x is :"+x);
		System.out.println("valuse of y is:"+y);
	}
	ConstructorChaining(float f){
		this(12.2,22.2);
		System.out.println("cons having float param");
		System.out.println("value of f is:"+f);
	}

	public static void main(String[] args) {
		System.out.println("program starts:");
		//ConstructorChaining c1 = new ConstructorChaining(16);
		//System.out.println("**************************************");
		//ConstructorChaining c2 = new ConstructorChaining(10,55.5);
		//System.out.println("////////////////////////////////////////");
		//ConstructorChaining c3 = new ConstructorChaining(10.1,11.1);
		//System.out.println("***************************************");
		ConstructorChaining c4 = new ConstructorChaining(12.2f);
		

	}

}
