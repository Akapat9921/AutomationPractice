package methods;

public class Primenumber {

	public static void main(String[] args) {
		int num = 16;
		
		boolean isPrime = primeNumber(num);
		if (isPrime) {
			System.out.println("number is prime: "+ num);
		}else {
			System.out.println("Number is not prime: "+ num);
		}
			

	}
     public static boolean primeNumber(int a) {
    	 if(a <= 1) {
    		 return false;
    		 
    	 }
    	 for(int i = 2; i <= a/2; i++) {
    		 if(a % i == 0) {
    			 System.out.println("False");
    			 return false;
    		    		 }
    	 }
    	 System.out.println("True");
    	 return true;
    	 
     }
}
   
