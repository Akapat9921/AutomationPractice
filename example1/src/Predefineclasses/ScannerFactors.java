package Predefineclasses;
import java.util.Scanner;
public class ScannerFactors {

	public static void main(String[] args) {
		System.out.println("Program for factors of given number: ");
		int num;
		Scanner snc = new Scanner(System.in);
		System.out.println("Enter number: ");
		num= snc.nextInt();
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
	}

}
