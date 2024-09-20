package Array;
import java.util.Arrays;
public class ArrayCopyElements {

	public static void main(String[] args) {

          ArrayCopyElements.copy();
	}
	public static void copy() {
		//original array
		int num[] = {11,12,13,14,15};
		System.out.println("Elements in array: "+num.length);
		for(int i = 0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		 int[] copyTo = Arrays.copyOf(num, 5);
		System.out.println("Elements in copyTo is: "+copyTo.length);
		for(int i = 0; i<copyTo.length; i++) {
			System.out.println(copyTo[i]);
		}
	}

}
