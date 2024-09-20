package Array;
import java.util.Arrays;

public class MArray4 {

	public static void main(String[] args) {
		// Java Program to clone the array
		int array[] = {33,3,4,5};
		//System.out.println("Element cunt is: "+array.length);
		//for(int i=0; i<array.length; i++) {
			//System.out.println(array[i]);
		System.out.println("Printing original array: ");
		for(int i: array) {
			System.out.println(i+" ");
		}
		System.out.println("\n Printing clone of the array:");
          int cloneArray[] = array.clone();
          for(int i : cloneArray) {
        	  System.out.println(i+" ");
          }
        System.out.println("\nAre both equal arr & carr ?");
  		System.out.println("array & cloneArray content validation : "+Arrays.equals(array, cloneArray));
  		System.out.println("******************************");
  		int newCopiedArray[]=Arrays.copyOf(array, array.length);//{ 33, 3, 4, 5 }
  		for (int i : newCopiedArray){
  			System.out.print(i+ " ");
  		}
	}

}
