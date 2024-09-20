package practisedaily;
abstract class Galaxy{
	public  abstract void earth();
	public void sun() {
		System.out.println("Sun is shining");
	}
}
	class planet extends Galaxy{
		public void earth() {
			System.out.println("Earth is round shape.");
		}
		public void moon() {
			System.out.println("Moon has white color");
		}
		
	}
	class stars extends Galaxy{
		public void earth() {
			System.out.println("earth is rotating");
		}
		public void tree() {
			System.out.println("i am mango tree");
		}
	}

public class Abstraction4 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		planet obj = new planet();
		obj.earth();
		obj.moon();
		obj.sun();
		stars obj1 = new stars();
		obj1.earth();
		obj1.sun();
		obj1.tree();
		Galaxy g1 = new planet();
		g1.earth();
		g1.sun();

	}

}

