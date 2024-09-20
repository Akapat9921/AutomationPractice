package Array;

public class ArrayLargestElement {

	public static void main(String[] args) {
		ArrayLargestElement ref = new ArrayLargestElement();
		ref.largest();

	}
	public void largest() {
		int[] arr = {22,55,44,12,89};
		int max = arr[0];
		for(int i = 0; i<arr.length; i++) {
			System.out.print("\nArray elements: "+arr[i]);
		}
		System.out.print("\nLargest element array is:\t ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
				
			}
		}
		System.out.print(max);
	}

}
