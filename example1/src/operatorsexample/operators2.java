package operatorsexample;

public class operators2 {

	public static void main(String[] args) {
		int num1=25, num2=40;
		System.out.println("Program starts:");
		boolean cond1=(num1!=num2);
		System.out.println("condition one is:"+cond1);
		boolean  cond2=(num1<num2);
		
		boolean res1=(cond1 || cond2);
		System.out.println("res1 is:"+ res1);
		boolean res2=(cond1 && cond2);
		System.out.println("res1 is:"+ res2);
		
		

	}

}
