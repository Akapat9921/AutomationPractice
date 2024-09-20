package practisedaily;

public class NonStaticmethod {

	public static void main(String[] args) {
		System.out.println("Program starts.");
		NonStaticmethod ref = new NonStaticmethod();
		ref.print();
	}
	public void print() {
		int a = 13 , b = 12;
		int res = a + b;
		System.out.println("Addition is:"+res);
	}

}
