package Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class HasSetEx1 {

	public static void main(String[] args) {
		//creating hashset and adding element
		Set<String> set = new HashSet<String>();
		// in set if you try to add duplicate element dn it will neglect that element instead of throwing an error
         set.add("Ravi");
         set.add("Vijay");
         set.add("Ravi");// it don't get added in set
         set.add("Ajay");
         System.out.println("After invoking remove(object) method: "+set);
         System.out.println("set size: "+set.size());
      // Traversing elements
         Iterator<String> itr = set.iterator();
         while(itr.hasNext()) {
        	 System.out.println(itr.next());
         }
         System.out.println("Removing Ravi from set: "+set.remove(itr));
         System.out.println("After invoking remove object method: "+set);
         HashSet<String> set1 = new HashSet<String>();
         set1.add("Ajay");
         set1.add("Gaurav");
         System.out.println("Set1 elements: "+set1);
         set.addAll(set1);
         System.out.println("updated list: "+set);
         
      // Removing all the new elements from HashSet
         set.removeAll(set1);
         System.out.println("After invoking removeall method: "+set);
         
      // Removing elements on the basis of specified condition
       set.removeIf(str-> str.contains("Vijay"));
       System.out.println(set);
	}

}
