package Array;

public class ArrayOddPosition {

	public static void main(String[] args) {
		ArrayOddPosition ref = new ArrayOddPosition();
		ref.printOddElements();

	}
	public void printOddElements() {
		int[] arr= {5,2,6,4,8,7,9};
		for(int i = 0; i<arr.length; i++) {
			System.out.print("\t"+arr[i]);
		}
		System.out.println("\nOdd position elements: ");
		for(int i = 0; i<arr.length; i= i+2) {
			
			System.out.print("\t"+arr[i]);
		}
	}

}
