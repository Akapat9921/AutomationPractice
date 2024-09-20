package ExceptionHandling;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		System.out.println("Program starts:");
		int[] num= new int[3];
		try {
			System.out.println(num[0]);//no exception , catch block wont be executed
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception found and handled");
		}
		System.out.println("Program ends");

	}

}
