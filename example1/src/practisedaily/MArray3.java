package practisedaily;
import java.util.Arrays;
public class MArray3 {

	public static void main(String[] args) {
		char[] arr= {'a','m','b','g','u','t','k'};
		System.out.println("Total no of elements in array: "+arr.length);
        char[] copyto = Arrays.copyOf(arr, 5);
        System.out.println("elements in copyto array is: "+copyto.length);
        for(int i=0; i<copyto.length; i++) {
        	System.out.println(copyto[i]);
        }
        System.out.println("\n******copy using range***********");
        char[] copyWithRange = Arrays.copyOfRange(copyto, 2, 6);
        for(int i=0; i<copyWithRange.length; i++) {
        	System.out.println(copyWithRange[i]+" ");
        }
	}

}
