package practisedaily;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("program for reverse num");
 int num = 123, rev=0;
 while(num!=0) {
	 int digit= num%10;
	 rev = rev*10 + digit;
	 num/=10;
 }
	 
	 	 System.out.println("Reverse no is: "+rev);
 }
	

}
 