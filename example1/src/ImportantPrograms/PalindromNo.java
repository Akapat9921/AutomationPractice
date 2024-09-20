package ImportantPrograms;

import java.util.Scanner;

public class PalindromNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no:");
		int num = sc.nextInt();
		int org_num = num;
		int rev=0;
		while(num!=0) {
			int digit = num%10;
			rev = rev*10 + digit;
			num = num/10;
		}
		//System.out.println(rev);
		if(org_num==rev) {
			System.out.println(org_num+"is palindrome no.");
		}else {
			System.out.println(org_num+ "is not palindrome number");
		}
	}

}
