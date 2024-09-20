package Array;

public class ArraySecondLargest {

	public static void main(String[] args) {
		int[] a = {24,12,33,10,20};
		System.out.println("Second largest element in array: "+second(a,5));

	}
	public static int second(int[] a, int total) {
		int temp = 0;
		for(int i=0; i<total; i++) {
			for(int j=i+1; j<total; j++) {
				if(a[i]<a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[1];
	}

}
