package ExceptionHandling;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		System.out.println("Program starts:");
		int num1=15, num2=0, res;
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		try {
		res= num1/num2;
		System.out.println("result is: "+res);

		}catch(Throwable e) {
			System.out.println("Exception found and handled");
			System.out.println("Exception message: "+e.getMessage());
		}
		System.out.println("Program ends");
	}

}
