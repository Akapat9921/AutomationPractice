package practisedaily;

public class Practice2 {

	public static void main(String[] args) {
		System.out.println("Program starts:");
		Practice2.primeNum(25);//static method
		Practice2 obj = new Practice2();
		obj.factorsOfGivenNum(85);
		

	}
	public static void primeNum(int a) {
		int ct=0;
		for(int i=1; i<=a; i++) {
			if(a%i==0) {
				ct++;
			}
		}
		if(ct==2) {
			System.out.println("Given no is prime: +a");
		}else {
			System.out.println("Given no is not prime: "+a);
		}
	}
	public void factorsOfGivenNum(int num) {
		System.out.println("Factors of given number is:");
		for (int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
	}

}
