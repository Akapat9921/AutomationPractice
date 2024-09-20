package Casting;
class Parent{
	void myHome() {
		System.out.println("I am paranet home");
	}
}
class Child extends Parent{
	void myCar() {
		System.out.println("I am child car");
	}
}

public class NonPrimitiveCast {

	public static void main(String[] args) {
		
System.out.println("Program starts");
Child ref = new Child();
ref.myCar();
ref.myHome();
System.out.println("*********Upcasting*****************");
Parent p1 = new Child();//auto/implicit upcasting --->Parent p1=(Parent)new Child();
p1.myHome();
Parent p2 = ref; //auto/implicit upcasting --->Parent p2=ref=new Child();
p2.myHome();
Parent p3 = (Parent)new Child();//explicit up casting
p3.myHome();
Parent p4 = (Parent)ref;//explicit up cating
p4.myHome();
	}

}
