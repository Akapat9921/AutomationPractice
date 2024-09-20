package practisedaily;

public class NonStaticOverloading {

	public static void main(String[] args) {
		System.out.println("Program starts");
		NonStaticOverloading ref = new NonStaticOverloading();
		ref.addition();
		System.out.println("************************");
		ref.addition(20, 20);
		System.out.println("************************");
		ref.addition(23.23, 12);

	}
	public void addition() {
		int a = 15;
		int b= 20;
		int res = a + b;
		System.out.println("Addition of two is: "+res);
	}
     public void addition(int a,int b) {
    	 int res = a + b;
    	 System.out.println("Addition of two is: "+res);
     }
     public void addition(double a, int b) {
    	 double res = a + b;
    			 System.out.println("Addition of two is: "+res);
;     }
}
