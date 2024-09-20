package demoexample;

public class variabledemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program starts:");
		int ht=4, base=3;
		double result=0.5*ht*base;
		System.out.println("Area of traingle is:"+ result);
		
		//reinitialization
		double pi=3.14;    //double pi=3.14, r=5, result1=pi*r*r;
		double r=5;
		double result1=pi*r*r;
		System.out.println("Area of circle:"+ result1);
		
		//reinitialization
		//simpleinterest = (p*r*t)/100
		/*
		int p=2000, rate=10, t=2;
		int result3=(p*rate*t)/100;
		System.out.println("simpleinterest is:"+ result3);
		*/
		int p= 5500;
		double rate= 8.5, time=3.5;
		double result3=(p*rate*time)/100;
		System.out.println("simpleinterest is:"+ result3);
		
		System.out.println("program ends.");
		
		

	}

}
