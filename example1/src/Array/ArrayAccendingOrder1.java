package Array;
import java.util.Arrays;
public class ArrayAccendingOrder1 {

	public static void main(String[] args) {
		int[] arr = {12,2,25,14,44,29,88};
		for(int i=0; i<arr.length; i++) {
			System.out.println("Original elements in array: "+arr[i]);
		}
		System.out.println("Array in assending order: ");
		Arrays.sort(arr);
		for(int a: arr) {
			System.out.print("\t"+a);
		}
	
		

	}

}
