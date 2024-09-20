package demoexample;

public class variabletypes3 {
	static int num1=25, num2=10;//static globale variable
	static int res=num1+num2;
    int num3=35, num4=5; //non static global variable
    int result= num3-num4;
	public static void main(String[] args) {
		//by static global variable
      System.out.println("Addition of two numbers is:"+ res);
      //reinitialisation
      num1=10; num2=15;
      res=num1+num2;
      System.out.println("new addition of two numbers:"+ res);
      
      //by non static global variable
      variabletypes3 ref = new variabletypes3 ();
      System.out.println("Subtraction of two numbers:"+ ref.result);
      //reinitialisation
      variabletypes3 ref1 = new variabletypes3 ();
      ref1.num3=50; ref1.num4=20;
      ref1.result= ref1.num3 - ref1.num4;
      System.out.println("subtraction of two new numbers is:"+ ref1.result);
      
      
	}

}
