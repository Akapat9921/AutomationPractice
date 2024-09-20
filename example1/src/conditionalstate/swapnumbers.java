package conditionalstate;

public class swapnumbers {

	public static void main(String[] args) {
		
int a= 5, b= 10;
   //print values before swapping
    System.out.println("Brfore swapping:");
    System.out.println("a="+ a);
    System.out.println("b="+ b);
    
    //print values after swapping
    int swap= a;
    a=b;
    b=swap;
    
    //print the swap values
    System.out.println("After swapping:");
    System.out.println("a="+ a);
    System.out.println("b="+ b);
	}

}
