package Practice;

public class StringBuffer1 {

	public static void main(String[] args) {
		/**
		 * Mutable
		 * Thread safe---> no multi threading ---> slow
		 * Object created only using new keyword
		 * size is growable
		 */
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("oroginal stringbuffer value: "+sb);
		sb.append("Java");
		System.out.println(sb);
		sb.insert(5, "Pune");
		System.out.println(sb);

	}

}
