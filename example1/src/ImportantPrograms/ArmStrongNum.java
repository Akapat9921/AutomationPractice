package ImportantPrograms;

import java.util.Scanner;

public class ArmStrongNum {

	public static void main(String[] args) {
		//Write a program to find whether given no. is Armstrong or not
		System.out.println("Enter any number: ");
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		int arm=0, rem, c;
		c=num;
		while(num>0) {
			rem = num%10;
			arm = (rem*rem*rem) + arm;
			num= num/10;
			
		}
		if(c==arm) {
			System.out.println("is Armstrong number");
		}else {
			System.out.println("is not Armstrong number121");
		}

	}

}
