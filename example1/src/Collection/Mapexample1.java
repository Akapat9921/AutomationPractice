package Collection;
import java.util.HashMap;
import java.util.Map;
public class Mapexample1 {

	public static void main(String[] args) {
		Map m1 = new HashMap();//Map reference and hashmap object
		m1.put("Key1", "Admin");//upcasting
		m1.put("Key2", "Admin");
		m1.put(null, "admin123");
		System.out.println("Map elements are: \n"+m1);
		System.out.println("Map elements count: \n"+m1.size());
		
		m1.put("key2","manager");
		m1.put(459,"manager");
		m1.put(null,1234);
		System.out.println("Map elements are: \n"+m1);
		System.out.println("Map element count: \n"+m1.size());
		System.out.println("Get the key value: \n"+m1.get("key2"));
		System.out.println("key set of map: \n"+m1.keySet());
		System.out.println("values of map: \n"+m1.values());
	}

}
/**
 * to add any element in Map we need use put(key,value) , key and Value both should be Object
 * toString() is overrided here as well
 * to get only keys from map use getKeys()
 * to get only values from Map use values()
 * if you want get a particular Key value dn use get(key)
 */ 
