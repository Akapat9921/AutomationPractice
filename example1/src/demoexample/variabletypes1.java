package demoexample;

public class variabletypes1 {
	static double pi=3.14, r=5.5;//Global static variable
	static double areaofcircle= pi*r*r;
	
	int ht=3, base=4;  //non static global variable
	double res= 0.5*ht*base;

	public static void main(String[] args) {
		System.out.println("Program starts:");
		//by using local variable
		int side=5;
		int result= side*side;
		System.out.println("Area of Square:"+ result);
		
		
		//by using static global variable
		System.out.println("Area of circle is:"+ areaofcircle);
		 pi=3.14; r=7.5;
	       areaofcircle=pi*r*r;
		System.out.println("Updated Area of Circle:"+ areaofcircle);
	

		 
		//by using non static global variable
		variabletypes1 ref= new variabletypes1 ();

		System.out.println("Area of triangle:"+ ref.res);
		
	//updating non static global variable creating new object
		variabletypes1 ref2 = new variabletypes1 ();
		ref2.ht= 4;
		ref2.base = 8;
		ref2.res = 0.5*ref2.ht*ref2.base;
		System.out.println("Updated area of triangle:"+ ref2.res);
		
	
	}

}
