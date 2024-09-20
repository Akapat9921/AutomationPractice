package Array;

public class ArrayExample3 {

	public static void main(String[] args) {
		//create an array
		int[] age = {12,4,56,10,11};
		//access each array elements 
		System.out.println("First element of array: "+ age[0]);
		System.out.println("Second element of array: "+ age[1]);
		System.out.println("Third elememt of array: "+ age[2]);
		System.out.println("fouth element of array: "+ age[3]);
		System.out.println("Fifth element of array: "+ age[4]);
		System.out.println("***************************************");
		System.out.println("using for loop");
		for(int i = 0; i<age.length; i++) {
			//System.out.println(age[i]);
			if(age[i] == 56) {
				System.out.println(age[i]+ " is present at index " +i);
				break;
			}
		}
		System.out.println("**************************************");
		System.out.println("using for-each loop");
		for(int a: age) {
			//System.out.println(a);
			if(a == 56) {
				System.out.println(a);
				break;
			}
		}

	}

}
