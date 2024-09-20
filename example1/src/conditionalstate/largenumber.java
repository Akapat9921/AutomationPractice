package conditionalstate;

public class largenumber {

	public static void main(String[] args) {
		int num1=19, num2=8, num3=11;
		int largest;
		
		if (num1 >= num2 && num1>= num3)
		{
			largest = num1;
		}else if (num2 >= num1 && num2>= num3) {
			largest= num2;
		}else {
			largest = num3;
		}
		
		System.out.println("Largest number is:"+ largest);

	}

}
