package Array;
class TestArray{
	//create a method which receives an array as parameter
	static void min(int arr[]) { //int arr[]=a= {33,13,4,50,15,1};
		int min = arr[0];//33
		for(int i = 1; i< arr.length; i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("min number array is: "+min);
	}
	static void max(int arr[]) {
		int max = arr[0];
		for(int i = 1; i <arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("max number array is: "+max);
	}
}

public class MinMaxArray {

	public static void main(String[] args) {
		int a[] = {33,13,4,50,15,1}; //declaring and initializing
		TestArray.min(a);//passing array to method
		TestArray.max(a);//passing array to method
		

	}

}
