package Collection;
import java.util.List;
import java.util.ArrayList;

public class ListExample2 {

	public static void main(String[] args) {
		   List l1 = new ArrayList();
		   l1.add("Mango");
		   l1.add(true);
		   l1.add(123);
		   l1.add('A');
		   System.out.println("list elements are: "+l1);
		   
		   System.out.println("*********Generic collection*************");
		   List<String> l2= new ArrayList<String>();
           l2.add("Pune");
           l2.add("Mumbai");
         //l2.add(123);//compile time error for storing other then String object

        List<Integer> l3=new ArrayList<Integer>();
   		l3.add(25);
   		l3.add(102);
   		//l3.add('c');//compile time error for storing other then Integer object
	}

}
