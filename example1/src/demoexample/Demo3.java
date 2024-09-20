package demoexample;

public class Demo3 {
	Demo3(){
		
		System.out.println("I am zero param cons....");
			}
	Demo3(int a){
		this();
		System.out.println("I am int param cons....");
		System.out.println("value of a is: "+a);
	}
	Demo3(double b, int num){
		this(60);
		System.out.println("I am having two params....");
	}
	Demo3(int x, double y, double z){
		this(100.25,54);
		System.out.println("i am having three params....");
	}

	public static void main(String[] args) {
	//	Demo3 obj = new Demo3();
		//Demo3 obj2 = new Demo3(10);
		//Demo3 obj3 = new Demo3(2500.52,25);
		Demo3 obj4 = new Demo3(5,3500.36,4500.86);
		

	}

}
