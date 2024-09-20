package Array;

public class ArrayEvenPosition {

	public static void main(String[] args) {
		ArrayEvenPosition ref = new ArrayEvenPosition();
		ref.printEvenPosition();

	}
	public void printEvenPosition() {
		int arr[] = {5,2,4,6,8,9,7,3};
		for(int i = 0; i<arr.length; i++) {
		System.out.print("\t "+arr[i]);
	}
		System.out.println("\nEven position array elements: ");
		for(int i= 1; i<arr.length; i=i+2) {
			System.out.print(" \t"+arr[i]);
		}
	}
      
}
