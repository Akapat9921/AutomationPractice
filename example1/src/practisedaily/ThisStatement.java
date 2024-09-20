package practisedaily;

public class ThisStatement {
	ThisStatement(){
		this(25);
		System.out.println("Zero param cons");
		System.out.println("having no param cons");
	}
	ThisStatement(int a){
		this(25.36);
		System.out.println("param cons");
		System.out.println("having int param");
	}
	ThisStatement(double b){
		System.out.println("Param cons...");
		System.out.println("Having double param");
	}
	

	public static void main(String[] args) {
		//ThisStatement pc1 = new ThisStatement();
		ThisStatement pc2 = new ThisStatement(12);
		ThisStatement pc3 = new ThisStatement(13.34);

	}

}
