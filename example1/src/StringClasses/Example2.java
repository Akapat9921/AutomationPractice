package StringClasses;

public class Example2 {

	public static void main(String[] args) {
		String s1 = "CoreJavaBasics";//const pool
		System.out.println("s1: "+s1);
		System.out.println("char count in s1: "+s1.length());
		//System.out.println("char at index 3: "+s1.charAt(3));
		for(int i=0; i<s1.length(); i++) {
			System.out.println("char at index " +i+": "+s1.charAt(i));
		}
      System.out.println("**********************************************");
      String s2 = "corejavabasics";
      System.out.println("s2: "+s2);
      System.out.println(" comparing s1 and s2 using equals() with value: "+s1.equals(s2));
      System.out.println(" comparing s1 and s2 using equals() with value: "+s1.equalsIgnoreCase(s2));
      System.out.println("s1 ends with 'sics': "+s1.endsWith("sics"));
      System.out.println("s1 contains  'eja': "+s1.contains("eJa"));
	}

}
