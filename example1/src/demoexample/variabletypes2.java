package demoexample;

public class variabletypes2 {
	static int num3=10, num4=5;
	static int res1=num3-num4;
    int num5=7, num6=5;
    int res2=num5*num6;
	public static void main(String[] args) {
		int num1=2, num2=4;
		int res=num1+num2;
		System.out.println("Number one is:"+ num1);
		System.out.println("Number two is:"+ num2);
		System.out.println("Addition of two numbers:"+ res);
		
		//by static global variable
		System.out.println("Subtraction of two numbers:"+ res1);
		//reinitialize
		num3=20; num4=10;
		res1=num3-num4;
		System.out.println("Subtraction of two updated numbers:"+ res1);
		
		//by non static global variable
		variabletypes2 ref= new variabletypes2 ();
		System.out.println("Multiplication of two numbres:"+ ref.res2);
		//reinitialize non static variable
		variabletypes2 ref2 = new variabletypes2 ();
		ref2.num5=8;
		ref2.num6=3;
		ref2.res2=ref2.num5*ref2.num6;
		System.out.println("Multiplication of two updated variables:"+ ref2.res2);
		
		
		
		

	}

}
