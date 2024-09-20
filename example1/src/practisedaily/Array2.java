package practisedaily;

public class Array2 {

	public static void main(String[] args) {
		int[] age= {15,12,25,20,18};
		System.out.println("third element in array: "+age[2]);
		System.out.println("Total no of elements in array: "+age.length);
      System.out.println("********loop*********");
      for(int i=0; i<age.length; i++) {
    	  System.out.println(age[i]);
      }
      System.out.println("*********for each loop*********");
      for(int value:age) {
    	  System.out.println(value);
      }
	}

}
