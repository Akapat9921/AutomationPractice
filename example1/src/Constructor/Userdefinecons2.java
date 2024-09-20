package Constructor;

public class Userdefinecons2 {
	//user define cons
	Userdefinecons2(int X){
		System.out.println("I am int param cons...");
		//age = x;
	}
	int age;
	void display() {
		System.out.println("I am display method of Userdefinecons2 ");
	}

	public static void main(String[] args) {
		Userdefinecons2 obj = new Userdefinecons2(65);
		System.out.println();
		

	}

}
