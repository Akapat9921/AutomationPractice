package ImportantPrograms;
import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println("Enter any number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum=0;
		for(int i=1; i<num; i++) {
			if(num%i==0) {
				sum = sum + i;
			}
		}
		if(num==sum) {
			System.out.println("Given no is perfect no");
		}else {
			System.out.println("Given no is not perfect no");
		}

	}

}
