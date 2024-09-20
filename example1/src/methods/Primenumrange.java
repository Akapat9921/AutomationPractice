package methods;

public class Primenumrange {

	public static void main(String[] args) {
		int start = 10; // starting range
		int end = 50;
		primeNumBetweenRange(start, end);

	}
	public static void primeNumBetweenRange(int start, int end) {
		for (int i= start; i<= end; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}
   public static boolean isPrime(int num) {
	   if(num<=1) {
		   return false;
		   
	   }
	   for(int i = 2; i <= num/2; i++) {
		   if(num % i == 0) {
			   return false;
			   
		   }
	   }
	   return true;
   }
   
}
