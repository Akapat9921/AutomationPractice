package conditionalstate;

public class positivenegativefactors {

	public static void main(String[] args) {
		int number=20;
		System.out.println("Positive factors of "+ number +":");
		for(int i=1; i<=number; i++) {
			if(number % i == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("Negative factors of "+ number +":");
		for(int i=1; i<= number; i++) {
			if(number % i == 0) {
				System.out.println(-i);
			}
		}
	
	}

}
