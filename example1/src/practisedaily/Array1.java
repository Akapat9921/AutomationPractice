package practisedaily;

public class Array1 {

	public static void main(String[] args) {
		int[] a = new int[5];//declaration and initialization
	  a[0] = 10;
	  a[1] = 15;
	  a[2] = 20;
	  a[3] = 25;
	  a[4] = 30;
System.out.println(a[0]);
System.out.println(a[1]);
System.out.println(a[2]);
System.out.println(a[3]);
System.out.println(a[4]);
//System.out.println(a[5]);
  System.out.println("Elements in array is: "+a.length);
  for(int i=0; i<a.length; i++) {
	  System.out.println(a[i]);
  }
  System.out.println("*******For each loop***********");
  for(int num:a) {
	  System.out.println(num );
  }
	}

}
