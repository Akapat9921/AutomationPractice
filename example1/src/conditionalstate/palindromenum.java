package conditionalstate;

public class palindromenum {

	public static void main(String[] args) {
		
    int number= 121;
    int originalnum = number;
    int reverse = 0;
    
    while(number != 0) {
    	int digit = number % 10;
    	reverse = reverse * 10 + digit;
    	number /= 10;
    	    	
    }
    if (originalnum == reverse) {
    	System.out.println("This is Palidrome number:"+ originalnum);
    }else {
    	System.out.println("Is not Palidrome number:"+ originalnum);
    }
    
	}

}
