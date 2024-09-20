package Array;

public class ArrayThirdLargest {

	public static void main(String[] args) {
		int[] a = {22,11,33,44,55};
		System.out.println("Third largest element is: "+third(a,5));

	}
	public static int third(int[] a, int total) {
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
		return a[total-3];
	}

}
