package oopsinheritance;
class fourwheeler{ //parent class
	//default constructor
	public void wheel() {
		System.out.println("I have four wheels");
	}
}
//child class of fourwheeler and parent class of maruti
class car extends fourwheeler{
	//default cons with default super();
	public void type() {
		System.out.println("I am a car");
	}
}
//child class of car
class maruti extends car{
	//default cons with default super();
	public void company() {
		System.out.println("I am Maruty");
	}
}

public class inheritance4 {
	

	public static void main(String[] args) {
		
      maruti fr = new maruti();//object of child class
      fr.wheel();
      fr.type();
      fr.company();
	}

}
