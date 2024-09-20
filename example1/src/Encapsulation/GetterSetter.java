package Encapsulation;
class Demo{
	private int age = 25;
	private double salary = 45000;
	
	//genarating getter
	public int getAge() {
		return age;
	}
	//generating setter
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}

public class GetterSetter {

	public static void main(String[] args) {
		Demo ref = new Demo();
		/** will getting compile time error while access private member from outside the class directly*/
		//System.out.println("Demo class, Private age is: "+ref.age);
		//System.out.println("Demo class private salary is: "+ref.salary);
		
		System.out.println("Demo class, private age using getter: "+ref.getAge());
		System.out.println("Demo class, private salary using getter: "+ref.getSalary());
		
		ref.setAge(50);
		ref.setSalary(48000);
		System.out.println("demo class, private age using setter is: "+ref.getAge());
		System.out.println("demo class, private salary using setter is: "+ref.getSalary()); 

	}


}

