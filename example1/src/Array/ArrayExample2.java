package Array;

public class ArrayExample2 {

	public static void main(String[] args) {
		// syntax ---> type[] arrayName = new type[size];
		int[] marks = new int[3];
		marks[0] = 75;
		marks[1] = 70;
		marks[2] = 80;
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		
		System.out.println("*******using loop*************");
		for(int i = 0; i<3; i++) {
			System.out.println(marks[i]);
		}
	}

}
