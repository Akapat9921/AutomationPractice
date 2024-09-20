package nonstaticmethod;

public class Nonstaticbasic1 {

	public static void main(String[] args) {
		Nonstaticbasic1 ref = new Nonstaticbasic1();
		ref.printCoreJavaTopic();
		System.out.println("Reverse number is:"+ ref.getReverse(123) );
		ref.printPrimeNumberFromGivenRange(5, 50);

	}
	//to write a program to print java topics
	void printCoreJavaTopic() {
		System.out.println("Basic Java Concept");
		System.out.println("Variables");
		System.out.println("Static And Not Static");
		System.out.println("Methods");
	}
	//To write a program to get reverse number 
	public int getReverse(int num) {
		System.out.println("Original number is: "+ num);
		int rev = 0, rem;
		while(num>0) {
			rem = num%10;
			rev = rev * 10 + rem;
			num = num/10;
			
		}
		return rev;
			}



//to write a program to print prime number between range
public void printPrimeNumberFromGivenRange(int start, int end) {
	System.out.println("Prime numbers between "+start+" to "+ end +"  ");
	for(; start<=end; start++) {
		int ct=0;
		for(int i=1; i<=start; i++) {
			if(start % i == 0) {
				ct++;
			}
		}
		if(ct==2) {
			System.out.println("Prime number is: "+start);
		}
	}
}
}
