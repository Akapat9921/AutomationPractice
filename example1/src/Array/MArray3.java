package Array;
import java.util.Arrays;

public class MArray3 {

	public static void main(String[] args) {
		// declaring a source array
       char[] copyFrom = {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
       System.out.println("Elements count in copyfrom array is: "+copyFrom.length);
    // declaring a destination array
       char[] copyTo = Arrays.copyOf(copyFrom, 5);
       System.out.println("Elements count in copyTo array is: "+copyTo.length);
       for(int i = 0; i< copyTo.length; i++) {
    	   System.out.println(copyTo[i]+" ");
       }
       System.out.println("*******copy with range*************");
       char[] copyWithRange = Arrays.copyOfRange(copyFrom, 2, 7);
       for(int i = 0; i< copyWithRange.length; i++) {
    	   System.out.print(copyWithRange[i]+" ");
       }
       System.out.println("\n**********After sorting**************");
       Arrays.sort(copyWithRange);//it will sort array elements in ascending order and stored sorted element in the same array
        for(char c : copyWithRange) {
        	System.out.println(c+" ");
        }
       
	}

}
/*
 * Arrays is a predefined class belongs to java.util package
 * it has so many useful function that can make developer life easier 
 */