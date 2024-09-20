package Polymorphism;

public class CompileTimePoly {
	static void add() {
		System.out.println("Add without param");
	}
	static void add(int a, int b) {
		System.out.println("Add with int param");
	}

	public static void main(String[] args) {
		CompileTimePoly.add();
		CompileTimePoly.add(25, 10);
		
	}

}
