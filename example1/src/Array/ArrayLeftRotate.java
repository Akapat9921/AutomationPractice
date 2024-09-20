package Array;

public class ArrayLeftRotate {

	public static void main(String[] args) {
	     // Original array
        int[] arr = {1, 2, 3, 4, 5};
        int numberOfRotations = 2; // Number of times to left rotate the array
        System.out.println("Original array:");
        printArray(arr);
        // Rotate the array
        for (int i = 0; i < numberOfRotations; i++) {
            leftRotate(arr);
        }
        System.out.println("Array after " + numberOfRotations + " left rotations:");
        printArray(arr);
    }
	
	  // Method to left rotate the array by one position
    public static void leftRotate(int[] arr) {
        int firstElement = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = firstElement;
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


