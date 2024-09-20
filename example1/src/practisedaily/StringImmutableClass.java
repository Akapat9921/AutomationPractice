package practisedaily;
final class Lion{
	final String name;
	final int age;
	Lion(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
}

public class StringImmutableClass {

	public static void main(String[] args) {
		Lion l1 = new Lion("Pune",12);
		System.out.println(l1.getName());
		System.out.println(l1.getAge());
		
		//l1.name = "Mumbai";//as name is declare as final, hence its value cant be change
		
		Lion l2 = new Lion ("Mumbai", 25);
		System.out.println(l2.getName());
		System.out.println(l2.getAge());

	}

}
