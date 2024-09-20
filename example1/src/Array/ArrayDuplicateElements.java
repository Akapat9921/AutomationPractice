package Array;

public class ArrayDuplicateElements {

	public static void main(String[] args) {
		ArrayDuplicateElements.duplicate();

	}
	public static void duplicate() {
		int[] arr = {1,4,1,5,6,9,8,7,4,5};
		for(int i= 0; i<arr.length; i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate elements are: "+arr[i]);
				}
				
			}
			
		}
		
	}
}


