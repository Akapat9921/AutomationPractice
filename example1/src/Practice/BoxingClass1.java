package Practice;

public class BoxingClass1 {

	public static void main(String[] args) {
		//boxing operation
		int num=25;
		Integer intobj = num;
		Integer intobj2 = (Integer)num;
		System.out.println(num);
		System.out.println(intobj);
		System.out.println(intobj2);
		System.out.println(num==intobj);
		System.out.println(num==intobj2);

	}

}
