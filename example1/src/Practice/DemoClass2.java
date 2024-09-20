  package Practice;

import java.util.Arrays;

public class DemoClass2 {

	public static void main(String[] args) {
		 int[] arr = {22,10,25,9,8,7};
		 System.out.println("Total elements in array is: "+arr.length);
		 for(int i=0; i<arr.length; i++) {
			 System.out.println("array elements are: "+arr[i]);
		 }
		 int[] copyto = Arrays.copyOf(arr, 3);
		 System.out.println("Copy array elements: "+copyto.length);
		 for(int i=0; i<copyto.length; i++) {
			 System.out.println(copyto[i]);
		 }
		 int[] rep = Arrays.copyOfRange(arr, 1, 4);
		 System.out.println("Total elements in array: "+rep.length);
		 for(int i=0; i<rep.length; i++) {
			 System.out.println("Array elements are: "+rep[i]);
		 }
		 
		

	}

}
