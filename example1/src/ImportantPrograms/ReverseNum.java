package ImportantPrograms;

public class ReverseNum {

	public static void main(String[] args) {
		ReverseNum.primeNum();
		
	}
	public static void primeNum() {
		int num=37, ct=0;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				ct++;
			}
		}
		if(ct==2) {
			System.out.println("Given no is prime: "+num);
		}else {
			System.out.println("Given no is not prime: "+num);
		}
	}

}
