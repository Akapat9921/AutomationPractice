package methods;

public class Methodbasic2 {

	public static void main(String[] args) {
		addNumber();
		additionOfTwoNumber(50,20);
		checkPrimenumber(15);
		
	}
	static void addNumber() {
		int num1=25, num2=45, res=num1+num2;
		System.out.println("Number1 :"+ num1);
		System.out.println("Number2 :"+ num2);
		System.out.println("Addition of two nu:"+ res);
	}
	static void additionOfTwoNumber(int x, int y) {
		int result= x + y;
		System.out.println("Number1 :"+ x);
		System.out.println("Number2 :"+ y);
		System.out.println("Addition of two nu:"+ result);
	}
    static void checkPrimenumber(int num) {
    	int  count=0;
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("given no is a prime no:"+ num);
		}else {
			System.out.println("Given no is not prime no:"+ num);
		}

	
		}
	}
    

