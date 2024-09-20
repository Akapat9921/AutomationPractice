package Array;

public class ArrayDecendingOrder {

	public static void main(String[] args) {
		ArrayDecendingOrder.assending();
	}
    public static void assending() {
    	int[] arr = {11,5,26,13,25,30};
    	int temp = 0;
    	for(int i=0; i<arr.length; i++) {
    		System.out.println("Original array is: "+arr[i]);
    	}
    	System.out.println("Assending order array: ");
    	for(int i=0; i<arr.length;i++) {
    		for(int j=i+1; j<arr.length; j++ ) {
    			if(arr[i]<arr[j]) {
    				temp = arr[i];
    				arr[i] = arr[j];
    				arr[j] = temp;
    			}
    		}
    	}
    	for(int i =0; i<arr.length;i++) {
    		System.out.println("\t"+arr[i]);
    	}
    }
}
