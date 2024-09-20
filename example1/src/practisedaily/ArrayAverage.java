package practisedaily;

public class ArrayAverage {

	public static void main(String[] args) {
		int[] number = {22,1,13,5,9,36};
		double sum=0;
		double avg;
		for(int val: number) {
			sum = sum +val;
		}
		int arrayLenght = number.length;
		avg = sum/arrayLenght;
		System.out.println("Sum of all elements in array is: "+sum);
		System.out.println("Average of elements in arrat is: "+avg);
		

	}

}
