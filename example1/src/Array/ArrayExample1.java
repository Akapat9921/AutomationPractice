package Array;

public class ArrayExample1 {
	

	public static void main(String[] args) {
		int a[] = new int[5];//declaration and instantiation
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
//here we have not given the values thats why it will print zero.
		a[0]= 10;//initialization
		a[1]= 20;
		a[2]= 30;
		a[3]= 40;
		a[4]= 50;
		System.out.println("After initialization");	
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		//now if you want to calculate total number of array;
		System.out.println("Array elements counts: "+a.length);//we have 5 variable store in array
		System.out.println("**************normal for-loop***************");
		for(int i=0; i<a.length;i++)//length is the property of array
		{
			System.out.println(a[i]);
		}
		System.out.println("*******************for each loop******************");
		/**
		 * LHS should be same as RHS(array) type in form of datatype or class
		 * for(LHS : RHS){
		 * 
		 * }
		 */
		
	}

}
