package Practice;
final class Demoo{
	final String name;
	final int age;
	Demoo(String name, int age){
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

public class StringDemo {

	public static void main(String[] args) {
		Demoo d1 = new Demoo("Pune", 12);
        System.out.println(d1.getName());	
        System.out.println(d1.getAge());
	
	}

}
