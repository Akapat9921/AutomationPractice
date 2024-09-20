package practisedaily;

public class NonstaticVariable {
      double salary;
      int age = 25;
	public static void main(String[] args) {
		NonstaticVariable ref = new NonstaticVariable();
		System.out.println("NSGV salary is: "+ref.salary);
		System.out.println("NSGV age is: "+ref.age);
		//reinitialization
		ref.salary = 25000;
		ref.age =35;
		System.out.println("updated NSGV salary is: "+ref.salary);
		System.out.println("updated NSGV age is: "+ref.age);

	}

}
