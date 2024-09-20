package methods;

public class Evennumber {

	public static void main(String[] args) {
		System.out.println("This program will check for even number");
      boolean isEven = CheckEvenNumber(6);
      if (isEven) {
    	  System.out.println("Number is Even: "+ isEven );
      }else {
    	  System.out.println("Number is not even."+ isEven);
      }
	}
	public static boolean CheckEvenNumber(int a) {
		return a % 2 == 0;
	}

}
