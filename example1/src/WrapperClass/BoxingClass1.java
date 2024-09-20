package WrapperClass;

public class BoxingClass1 {

	public static void main(String[] args) {
		int age = 20;
		System.out.println("Age: "+age);//20
		
		Integer obj = 45;//implicit /auto boxing ---> java compiler convert it into integer obj = new Integer(45);
		System.out.println("obj: "+obj);
		
		Integer intobj1 = age;//implicit boxing operation 
		System.out.println("intobj1:"+intobj1);
		
		System.out.println(age==intobj1);
		Integer intobj2 = 50;//implicit boxing operation
		System.out.println("intobj2: "+intobj2);
		Integer intobj3 = 30;
		System.out.println("intobj3: "+intobj3);
        
		char c1='Z';
		Character xyz = c1;//implicit
		System.out.println(c1);
		System.out.println(xyz);
	}

}
