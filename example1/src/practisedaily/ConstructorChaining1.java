package practisedaily;

public class ConstructorChaining1 {
	String empName;
	int empId;
	String designation;
	int phNo;
	String address;
	ConstructorChaining1(String emp_name,int emp_id){
		empName = emp_name;
		empId = emp_id;
		System.out.println("Emp name is: "+empName);
		System.out.println("Emp id is: "+empId);
	}
	//we need to add more field thats why we are creating new constructor
	ConstructorChaining1(String emp_designation){
		this("Parul",1638);
				designation = emp_designation;
		System.out.println("emp designation is: "+designation);
	}
	//againg we need to add some more field
	ConstructorChaining1(int emp_ph, String emp_address){
		this("Sr. engineer");
		phNo = emp_ph;
		address = emp_address;
		System.out.println("Emp phone no is: "+phNo);
		System.out.println("Emp address is: "+address);
	}

	public static void main(String[] args) {
		//ConstructorChaining1 e = new ConstructorChaining1("Parul",1638);
		//ConstructorChaining1 e1 = new ConstructorChaining1("Sr. engineer");
		ConstructorChaining1 e2 = new ConstructorChaining1(22394215,"123,Karolbag");
		//System.out.println("Emp nam is: "+e.empName);
		//System.out.println("Emp Id is: "+e.empId);

	}

}
