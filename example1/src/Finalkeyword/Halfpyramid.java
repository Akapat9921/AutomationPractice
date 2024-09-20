package Finalkeyword;

public class Halfpyramid {

	public static void main(String[] args) {
		//write a program to print half pyramid using numbers
		for(int i = 1; i<= 5; i++) { //number of rows
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
