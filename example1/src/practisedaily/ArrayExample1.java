package practisedaily;

import java.util.Arrays;
public class ArrayExample1 {

	public static void main(String[] args) {
		int[] num = {1,2,5,4,11,113,55};
		System.out.println("Elements is num array is: "+num.length);
		
		//copy into source array
		int[] copy = Arrays.copyOf(num, 5);
		for(int i=0; i<copy.length; i++) {
			
		}
		System.out.println("elements in copy array: "+copy.length);
		System.out.println("**********************************************");
		System.out.println("Sort in assending order");
        Arrays.sort(num);
        for(int a: num) {
        	System.out.print(a+" ");
        }
	}

}
