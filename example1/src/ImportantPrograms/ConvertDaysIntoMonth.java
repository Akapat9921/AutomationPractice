package ImportantPrograms;
import java.util.Scanner;

public class ConvertDaysIntoMonth {

	public static void main(String[] args) {
		//Write a program to convert given no. of days into months and days. (Assume that each month is of 30 days)
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter no of days: ");
         int num = sc.nextInt();
         int days = num%30;
         int months = num/30;
         System.out.println("Total  days = "+months+" Months and "+days+" days");
	}

}
