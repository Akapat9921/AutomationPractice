package Collection;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeMapEx2 {

	public static void main(String[] args) {
		// Creating and adding elements
		TreeSet<String> al = new TreeSet<String>();
		/*
		 * add method overrided here, before adding any new element it will compare with existing elements 
		 * and store them in sorted order
		 */
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		System.out.println("TreeSet elements are: "+al);
		
		// Traversing elements
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		} 
		System.out.println("Traversing element through Iterator in descending order");
        
		Iterator i = al.descendingIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(24);
		set.add(66);
		set.add(12);
		set.add(15);
		System.out.println("TreeSet elements are: "+set);
		System.out.println("first element Value: " + set.pollFirst());
		System.out.println("After pollFirst(),TreeSet elements are: "+set);
		System.out.println("last element Value: " + set.pollLast());
		System.out.println("After pollLast(), TreeSet elements are: "+set);


	}

}
