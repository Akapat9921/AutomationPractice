package methods;

public class Factorofanynum {

	public static void main(String[] args) {
	int number = 22;
	factorOfAnyGiveNumber(number);

	}
	public static void factorOfAnyGiveNumber(int num) {
System.out.println("The Foctors of "+ num + " are:");
for(int i=1; i <= num; i++) {
	if(num % i == 0) {
		System.out.println(i);
	}
	}
}
}
