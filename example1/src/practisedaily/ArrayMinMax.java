package practisedaily;

public class ArrayMinMax {

	public static void main(String[] args) {
		int a[]= {33,13,14,55,26};
		ArrayMinMax.min(a);
		ArrayMinMax.max(a);
	}
	static void min(int arr[]) {
		int min = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("min no in array is: "+min);
	}
	
	static void max(int arr[]) {
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(max<arr[i]) {
				
			}
		}
		System.out.println("Max no in array is: "+max);
		
	}

}
