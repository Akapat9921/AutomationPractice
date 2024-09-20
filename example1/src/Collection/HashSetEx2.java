package Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class HashSetEx2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		list.add("Ravi");
		System.out.println("list elements: "+list);
		
		HashSet<String> set = new HashSet<String>(list);//converti g list into set
		System.out.println("Initial set elements: "+set);
		set.add("Gaurav");
		System.out.println("Set elements: "+set);
		
	 Iterator<String> i = set.iterator();
	 while(i.hasNext()) {
		 System.out.println(i.next());
	 }

	}

}
