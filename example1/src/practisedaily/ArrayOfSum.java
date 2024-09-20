package practisedaily;

public class ArrayOfSum {

	public static void main(String[] args) {
		//sum of all elements of array
		int[] num = {5,10,22,8,44,36};
		double sum= 0;
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		for(int val:num) {
			sum = sum+val;
			int arrayLenght = num.length;
		}
		System.out.println("sum of all element in array is: "+sum);
	}

}
