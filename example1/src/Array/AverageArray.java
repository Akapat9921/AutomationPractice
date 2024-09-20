package Array;

public class AverageArray {
	

	public static void main(String[] args) {
		int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 9, 12};
		double sum = 0;
		double average;
		//access all elements using for each loop add each element in sum
      for(int number : numbers) {
    	  sum = sum + number;
      }
   // get the total number of elements
    int arrayLenght = numbers.length;
    average = sum/ arrayLenght;
    System.out.println("Sum ="+ sum);
    System.out.println("Average = "+ average);
		

	}

}
