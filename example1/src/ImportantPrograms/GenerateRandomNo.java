package ImportantPrograms;

import java.util.Random;

public class GenerateRandomNo {

	public static void main(String[] args) {
		int num;
		Random obj = new Random();
		num = obj.nextInt(100);
		System.out.println("Genarated random no is: "+num);

	}

}
