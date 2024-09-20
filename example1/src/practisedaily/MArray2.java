package practisedaily;

public class MArray2 {

	public static void main(String[] args) {
		int[][] num = {{1,2,3},{1,0},{5,6,7,8}};
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length;j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		
		char[][] chararr = {{'a','b','c'},{'d','e'},{'z','x','c','v'}};
		for(int i=0; i<chararr.length; i++) {
			for(int j=0; j<chararr[i].length; j++) {
				System.out.print(chararr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
