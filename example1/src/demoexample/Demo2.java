package demoexample;

public class Demo2 {

	public static void main(String[] args) {
		System.out.println("Program starts:");
		primeNumber(20);
		Demo2.primeNumber(29);
		Demo2 obj = new Demo2();
		obj.factorsOfNum(25);

	}
	public static void primeNumber(int num) { 
		int ct=0;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				ct++;
			}
		}
		if(ct==2) {
			System.out.println("Given no is prime: "+num);
		}else {
			System.out.println("Given num is not prime: "+num);
		}
	}
	
	public void factorsOfNum(int a) {
		System.out.println("Factors of given number is: ");
		for(int i=1; i<=a; i++) {
			if(a%i==0) {
				System.out.println(i);
			}
		}
		
	}

}
