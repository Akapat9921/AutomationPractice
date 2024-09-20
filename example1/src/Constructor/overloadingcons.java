package Constructor;

public class overloadingcons {
	overloadingcons (){
		System.out.println("Zero parameterized cons...");
		System.out.println("having no param...");
	}
	overloadingcons (int a){
		//System.out.println("Value of a is :"+a);
		System.out.println("Param cons...");
		System.out.println("Hvaing int param...");
	}
	overloadingcons (double b){
		System.out.println("param cons...");
		System.out.println("Having double param...");
	}
	overloadingcons (int a, double b, int c){
		System.out.println("param cons...");
		System.out.println("having int, double, int param");
	}

	public static void main(String[] args) {
		overloadingcons obj1 = new overloadingcons ();
		
		overloadingcons obj2 = new overloadingcons (12);
	
		overloadingcons obj3 = new overloadingcons (12.12);
		overloadingcons  obj4 = new overloadingcons (11, 44.4, 10);

	}

}
