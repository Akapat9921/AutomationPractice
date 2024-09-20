package Array;

public class ArraySmallestElement {

	public static void main(String[] args) {
		ArraySmallestElement.smallest();

	}
	public static void smallest() {
		int[] arr = {12,15,9,40,13};
		int min = arr[0];
		for(int i = 0; i<arr.length; i++) {
			System.out.println("\n elements in array: "+arr[i]);
		}
		System.out.print("\n smallest element in array: ");
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}

}
