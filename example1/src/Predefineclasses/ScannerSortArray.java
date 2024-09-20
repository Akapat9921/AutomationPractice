package Predefineclasses;
import java.util.Arrays;
import java.util.Scanner;
public class ScannerSortArray {

	public static void main(String[] args) {
	Scanner snc = new Scanner(System.in);
	
	System.out.println("Enter the no of element in array: ");
	int num = snc.nextInt();
	snc.nextLine();
	
	int[] arr = new int[num];
	
	System.out.println("Enter the elements of array separated by spaces: ");
	String input = snc.nextLine();
	String[] inputArray = input.split(" ");
	
	
	if(inputArray.length !=num) {
		System.out.println("Error");
		snc.close();
		return;
	}
	Arrays.sort(arr);
	
	System.out.println("Sorted array: ");
	for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);
		
	}
	}

}
