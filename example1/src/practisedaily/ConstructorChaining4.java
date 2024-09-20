package practisedaily;

public class ConstructorChaining4 {
	String clgName;
	int stdNUM;
	
	int stdPhno;
	double stipend;
	ConstructorChaining4(String clg_name, int Std_num){
		this(25369);
		clgName= clg_name;
		stdNUM=Std_num;
		System.out.println("Collage name is: "+clgName);
		System.out.println("Student number is: "+stdNUM);
		
	}
	ConstructorChaining4( int std_phno){
		this(555.55);
		stdPhno = std_phno;
		System.out.println("student phone no is: "+stdPhno);
	}
	ConstructorChaining4(double sti_pend){
		stipend = sti_pend;
		System.out.println("Student stipend is: "+stipend);
	}
	
	
	

	public static void main(String[] args) {
		System.out.println("Program starts");
		ConstructorChaining4 c1 = new ConstructorChaining4("VJTI",15);
		//ConstructorChaining4 c2 = new ConstructorChaining4(5262354);
		//ConstructorChaining4 c3 = new ConstructorChaining4(1000.55);
	}

}
