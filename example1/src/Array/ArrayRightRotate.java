package Array;

public class ArrayRightRotate {

	public static void main(String[] args) {
	       // Original array
        int[] arr = {1, 2, 3, 4, 5};
        int numberOfRotations = 2; // Number of times to right rotate the array

        System.out.println("Original array:");
        printArray(arr);

        // Rotate the array
        for (int i = 0; i < numberOfRotations; i++) {
            rightRotateByOne(arr);
        }

        System.out.println("Array after " + numberOfRotations + " right rotations:");
        printArray(arr);

	}
	  public static void rightRotateByOne(int[] arr) {
	        int lastElement = arr[arr.length - 1]; // Store the last element
	        for (int i = arr.length - 1; i > 0; i--) {
	            arr[i] = arr[i - 1]; // Shift elements to the right
	        }
	        arr[0] = lastElement; // Place the last element at the beginning
	    }

	    // Method to print the array
	    public static void printArray(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }
	}


