package Constructor;

public class Userdefinecons {
	//user define constructor
	Userdefinecons(){
		System.out.println("I am zero param cons...");
		age = 35;
		
	}
	int age;
	void display() {
		System.out.println("I am display method of Userdefinecons class.");
	}
		

	public static void main(String[] args) {
		Userdefinecons obj = new Userdefinecons();
		
		System.out.println(obj.age);
		obj.display(); 
		

	}

}
