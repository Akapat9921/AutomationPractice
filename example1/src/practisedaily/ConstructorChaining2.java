package practisedaily;

public class ConstructorChaining2 {
	
	int age;
	double salary;
	int accNum;
	String Address;
	
	ConstructorChaining2(int myAge, double mySalary){
		this("Banglore");
		age = myAge;
		salary = mySalary;
		System.out.println("my age is: "+age);
		System.out.println("My salary is: "+salary);
	}
	ConstructorChaining2 (int acc_num){
		accNum = acc_num;
		System.out.println("Account num is: "+accNum);
	}
	ConstructorChaining2 (String adress){
		this(1234);
		Address = adress;
		System.out.println("my address is: "+Address);
	}
	
	
	

	public static void main(String[] args) {
		ConstructorChaining2 c = new ConstructorChaining2(35,45000);
		//ConstructorChaining2 c1 = new ConstructorChaining2(1234);
		//ConstructorChaining2 c2 = new ConstructorChaining2("Banglore");
		//System.out.println("Age is: "+c.age);
		//System.out.println("salary is: "+c.salary);

	}

}
