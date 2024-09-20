package conditionalstate;

public class primenumber {

	public static void main(String[] args) {
		int num=8, count=0;
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("given no is a prime no:"+ num);
		}else {
			System.out.println("Given no is not prime no:"+ num);
		}

	}

}
