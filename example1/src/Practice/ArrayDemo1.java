package Practice;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int[] arr= {5,9,7,10,2,12};
		System.out.println("Total element in array: "+arr.length);
		for(int i=0; i<arr.length; i++) {
			System.out.println("Array elements are: "+arr[i]);
		}
		System.out.println("*******for each loop**********");
         for(int num: arr) {
        	 System.out.println(num);
         }
	}

}
