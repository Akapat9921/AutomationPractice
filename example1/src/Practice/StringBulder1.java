package Practice;

public class StringBulder1 {

	public static void main(String[] args) {
		/**
		 * Mutable
		 * not a thread safe ---> multi threading ---> fast
		 * object will be created only by using new keyword
		 * growable
		 */
	   StringBuilder sb = new StringBuilder("Hello");
	   sb.append("Java");
	   System.out.println(sb);
	   sb.reverse();
	   System.out.println(sb);
	   
	   StringBuilder sb1 = new StringBuilder("Hello Java");
	   System.out.println(sb1);
	   
	   StringBuilder sb2 = new StringBuilder("Hello Java");
	   System.out.println(sb2);
	   System.out.println(sb1.equals(sb2));
	   System.out.println(sb1==sb2);
	   
	   System.out.println((sb1.toString().equals(sb2.toString())));


	}

}
