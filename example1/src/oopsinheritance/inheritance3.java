package oopsinheritance;
class fruit{ //parent class
	fruit(){
		System.out.println("Fruit class cons...");
	}
	public void taste() {
		System.out.println("Fruits are sweet");
	}
}
class apple extends fruit{ //child class
	apple(){
		//super(); //java compiler will write default super()
		System.out.println("Apple class cons...");
	}
	public void shape() {
		System.out.println("Apple is round");
	}
}

public class inheritance3 {

	public static void main(String[] args) {
		apple fr = new apple();//object of child class
		fr.taste();//call method of parent  class
		fr.shape();//call method of child class

	}

}
