package operatorsexample;

public class operatorbasic {

	public static void main(String[] args) {
		System.out.println("Program starts:");
		int num1= 25, num2= 40;
		boolean res=(num1==num2);
		System.out.println("comparing num1 and num2 using '=='"+ res);
		System.out.println("comparing num1 and num2 using '=='"+ (num1==num2));
		System.out.println("comparing num1 and num2 using '!='"+ (num1!=num2));
		System.out.println("comparing num1 and num2 using '<'"+(num1<num2));
		System.out.println("comparing num1 and num2 using '>'"+ (num1>num2));
		System.out.println("comparing num1 and num2 using '<='"+ (num1<=num2));
		System.out.println("comparing num1 and num2 using '>='"+ (num1>=num2));
		System.out.println("Program ends.");
		

	}

}
