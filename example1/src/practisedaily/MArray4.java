package practisedaily;

public class MArray4 {

	public static void main(String[] args) {
		int arr[] = {25,36,54,2,9};
		System.out.println("Printing original array:");
		for(int i: arr) {
			System.out.println(i);
		}
		System.out.println("\n Printing clone array:");
		int cloneArray[] = arr.clone();
		for(int i: cloneArray) {
			System.out.println(i);
		}

	}

}
