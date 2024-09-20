package Constructor;

public class demo2 {

	public static void main(String[] args) {
		System.out.println("program starts for prime number:");
		int a = 37;
		int ct = 0;
		for(int i = 1; i <= a; i++) {
			if(a % i == 0) {
				ct++;
			}
		}
			if(ct == 2) {
				System.out.println("Given number is prime num :"+ a);
			}else {
				System.out.println("Given num is not prime num: "+ a);
		
			
		}
	
	}
}


