package WrapperClass;
final class Demo{
	final String name;
	final int age;
	Demo(String name, int age){
		this.name= name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
	
}

public class StringClass2 {

	public static void main(String[] args) {
		Demo d1 = new Demo("Pune",12);
		System.out.println(d1.getName());
		System.out.println(d1.getAge());

	}

}
