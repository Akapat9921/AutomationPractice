package Array;

public class AverageArray2 {

	public static void main(String[] args) {
		int[] values = {22,11,5,10,33,24,15,9};
		double sum= 0;
		double average;
		for(int value : values) {
			sum = sum + value;
		}
		int	arrayLength1 = values.length;
		average = sum/ arrayLength1;
		System.out.println("Sum is:"+ sum);
		System.out.println("Average is : "+average);
		
	}

}
