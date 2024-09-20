package Constructor;

public class demo4 {

	public static void main(String[] args) {
		System.out.println("program for peime number:");
		//call the primenumber method to check it is prime or not and print the num
		int result = primeNumber(19);
		if(result==1) {
			System.out.println("Given num is prime ");
		}else {
			System.out.println("given num is not prime.");
		}

	}
	public static int primeNumber(int a) {
		int ct = 0;
		for(int i = 1; i <= a; i++) { 
			if(a % i == 0) {
				ct++;
				
			}
			
		}
		if (ct==2) {
			return 1;// num is prime
		}else {
			return 0;// num is not prime
		}
	}

}
