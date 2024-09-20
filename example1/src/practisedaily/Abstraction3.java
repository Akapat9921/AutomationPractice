package practisedaily;
 abstract class country{
abstract void city();
 public void clgName() {
	 System.out.println("My clg name is St. Joseph");
 }
	
}
 class India extends country{
	 void city() {
		 System.out.println("city is Mumbai");
	 }
	 void mumbai() {
		 System.out.println("Mumbai has Arebian sea");
	 }
 }
 class America extends country{
	 void city() {
		 System.out.println("City name is New York.");
	 }
	 void baseBall() {
		 System.out.println("America Plays Baseball.");
	 }
 }

public class Abstraction3 {
	protected void Germany() {
		System.out.println("Germany is famous for cars.");
	}

	public static void main(String[] args) {
//		country ct = new country(); //getting error bcoz we can not create object of abstract class
//		ct.city();
//		ct.clgName();
		India a1 = new India();
		a1.city();
		a1.mumbai();
		a1.clgName();
		System.out.println("**************************************");
		country ct = new India();//giving reference of parent class and creating object of child class
		ct.city();
		ct.clgName();

	}

}
