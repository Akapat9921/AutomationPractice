package ImportantPrograms;

import java.util.Arrays;

public class EqualityOfArray {

	public static void main(String[] args) {
		//Write a java program to check the equality of two arrays using different methods
		int[] arrone = {1,2,3,4,5};
		int[] arrtwo = {1,2,3,4,5};
		boolean equals= Arrays.equals(arrone,arrtwo);
		System.out.println("Arrays are equal: "+equals);
		
//		if(arrone.length==arrtwo.length) {
//			System.out.println("Arrays are equal");
//		}else {
//			System.out.println("Arrays are not equal");
//		}

	}

}
