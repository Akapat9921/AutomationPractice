package WrapperClass;

public class BoxingClass3 {

	public static void main(String[] args) {
		//boxing operation
		int num = 25;
		Integer intobj = num;//auto-boxing operation
		Integer intobj2= (Integer)num;//explicit
		System.out.println(num);
		System.out.println(intobj);
		System.out.println(intobj2);
		System.out.println(num==intobj);
		System.out.println(num==intobj2);
		
		//unboxing
		int num2 = intobj.intValue();
		System.out.println(num2);
		
		Character ch='z';//implicit/auto-boxing
		char c1=ch.charValue();//unboxing
		System.out.println(ch);
		System.out.println(c1);

	}

}
