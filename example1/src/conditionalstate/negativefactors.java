package conditionalstate;

public class negativefactors {

	public static void main(String[] args) {
	int num = -10;
	for (int i=num; i<= -(num); i++) {
		if(i != 0) {
			if (num % i == 0) {
				System.out.println("factor of" + num + "is:"+ i);
			}
		}
	}

	}

}
