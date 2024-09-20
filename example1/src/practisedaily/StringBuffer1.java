package practisedaily;

public class StringBuffer1 {

	public static void main(String[] args) {
		/**
		 * Mutable
		 * Thread safe---> no multi threading ---> slow
		 * Object created only using new keyword
		 * size is growable
		 */
		
		StringBuffer sb = new StringBuffer("Hello ");
		System.out.println("original string buffer: "+sb);
		
		sb.append("Java");
		System.out.println(sb);//Hello  java
		
		sb.insert(5, "Pune");
		System.out.println(sb);
		
		sb.replace(1, 3, "xxx");
		System.out.println(sb);

	}

}
