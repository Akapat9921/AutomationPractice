package practisedaily;

public class stringBoxing {

	public static void main(String[] args) {
		int age=20;
		System.out.println("Age: "+age);
		
		Integer obj = 45;//implicit /auto boxing--->  java compiler convert it into Integer obj=new Integer(45);
		System.out.println("obj: "+obj);//45
		
		Integer intobj1 = age;//implicit boxing operation
        System.out.println("intobj1: "+intobj1);//20
        
        System.out.println(age==intobj1);
        Integer intobj2 = 50;////implicit boxing operation
        System.out.println("intobj2: "+intobj2);
        
        char c1 = 'z';
        Character xyz = c1;
        System.out.println(c1);
        System.out.println(xyz);

	}

}
