package Constructor;

public class Thisstatement {
	Thisstatement(){
		this(25);
		System.out.println("Zero param cons...");
		System.out.println("Having no param...");
	}
	Thisstatement (int a){
		this(25.26);
		System.out.println("Param cons");
		System.out.println("Having int param...");
	}
	Thisstatement (double b){
		System.out.println("param cons...");
		System.out.println("Having double param...");
	}
	

	public static void main(String[] args) {
		Thisstatement pc1 = new Thisstatement ();
		//Thisstatement pc2 = new Thisstatement (12);
		//Thisstatement pc3 = new Thisstatement (13.34);
		

	}

}
