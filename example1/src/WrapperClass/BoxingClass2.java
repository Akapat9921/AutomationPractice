package WrapperClass;

public class BoxingClass2 {

	public static void main(String[] args) {
		char c1 = 'A';	
		Character charobj1 = c1;//// boxing implicit/auto boxing
        System.out.println(c1==charobj1);
        Character charobj2 = 'Z';
        Character charobj3 = 'H';
        
        System.out.println("c1: "+c1);
        System.out.println("charobj1: "+charobj1);
        System.out.println("charobj2: "+charobj2);
        System.out.println("charobj3: "+charobj3);
        
        //unboxing
        char ch= charobj1.charValue();
        System.out.println("ch: "+ch);
        
        boolean b = true;
        Boolean bobj=b;//
        System.out.println(bobj==b);
        
        //unboxing
        boolean bn = bobj.booleanValue();
        System.out.println("bn"+bn);
        
        
	}

}
