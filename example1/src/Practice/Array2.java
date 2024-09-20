package Practice;
import java.util.Arrays;
public class Array2 {

	public static void main(String[] args) {
		int[] arr = {22,55,8,4,5,6};
		double sum=0;
		System.out.println("Total elements in array is: "+arr.length);
        for(int i=0; i<arr.length; i++) {
        	System.out.println("elements in array: "+arr[i]);
        }
	
	for(int num : arr) {
	
	sum = sum + num;
	}
	System.out.println("Sum of all elements in array is: "+sum);

}
}
