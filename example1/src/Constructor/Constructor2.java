package Constructor;

public class Constructor2 {
	Constructor2(){
		System.out.println("Zero param cons...");
		System.out.println("having no param...");
	}
	Constructor2(int a){
		System.out.println(" param cons...");
		System.out.println("having param int...");
		System.out.println(a );
	}
	Constructor2(double b){
		System.out.println(" param cons...");
		System.out.println("having param duble b..");
		System.out.println("Value of varible is: "+ b);
	}

	public static void main(String[] args) {
		Constructor2 pc1 = new Constructor2();
		Constructor2 pc2 = new Constructor2(13);
		Constructor2 pc3 = new Constructor2(14.14);
	
		//System.out.println("Value of duoble is: "+pc3);
		

	}

}
