package Predefineclasses;
import java.util.Scanner;
public class ScannerReverseNo {

	public static void main(String[] args) {
		int num, rev=0;
		//int ct=0;
		//create an instance of Scanner class to read data at runtime
		Scanner snc=new Scanner(System.in);
		System.out.println("Enter number: ");
		num = snc.nextInt();
		while(num!=0) {
			int digit = num%10;
			rev= rev*10 + digit;
			num = num/10;
		}
		System.out.println("Reverse no is: "+rev);

	}

}
