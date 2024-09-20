package Practice;
import java.util.Arrays; 
public class Array1 {

	public static void main(String[] args) {
		int[] arr = {12,24,8,9,10};
         System.out.println("Total elemetns in Array is: "+arr.length);
         for(int num: arr) {
        	 System.out.println(num);
         }
	
	int[] copy = Arrays.copyOf(arr, 3);
	for(int num: copy) {
		System.out.println("Copied elements are: "+num);
	}
	
	}

}

