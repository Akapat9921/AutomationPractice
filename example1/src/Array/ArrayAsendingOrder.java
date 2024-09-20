package Array;

public class ArrayAsendingOrder {

	public static void main(String[] args) {
		ArrayAsendingOrder.assending();

	}
  public static void assending() {
	  int[] arr = {12,16,5,45,23,30};
	  int temp = 0;
	  for(int i=0; i<arr.length; i++) {
		  System.out.println("Original Array: "+arr[i]); 
	  }
	  System.out.println("Asending order array is: ");
	  for(int i=0; i<arr.length; i++) {
		  for(int j=i+1; j<arr.length;j++) {
			  if(arr[i]>arr[j]) {
				  temp = arr[i];
				  arr[i] = arr[j];
				  arr[j]= temp;
				  
			  }
		  }
	  }
	  for(int i=0; i<arr.length;i++) {
		  System.out.println("\t"+arr[i]);
	  }
  }
}
