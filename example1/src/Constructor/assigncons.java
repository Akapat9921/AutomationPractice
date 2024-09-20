package Constructor;

public class assigncons {
	

	public static void main(String[] args) {
		System.out.println("hello");
		factors(1234567);
	
	}
	static public void factors(int a) {
		for(int i = 1; i<=a; i++ ) {
			if(a % i == 0) {
				System.out.println(i);
			}
		}
		//System.out.println(i);
	}
	

}
