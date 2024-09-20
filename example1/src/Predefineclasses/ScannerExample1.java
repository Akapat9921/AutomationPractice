package Predefineclasses;
import java.util.Scanner;
public class ScannerExample1 {

	public static void main(String[] args) {
		int num1, num2, res;
		//create an instance of scanner class to read the data at runtime
		Scanner snc = new Scanner(System.in);
		System.out.println("Enter no. 1: ");
		num1 = snc.nextInt();
		System.out.println("Enter no. 2: ");
		num2 = snc.nextInt();
		res= num1 + num2;
		System.out.println("no1: "+num1);
		System.out.println("no2: "+num2);
		System.out.println("Result: "+res);
		

	}

}
