package Array;

public class MArray2 {

	public static void main(String[] args) {
		//declaring and initializing 2D array 
		int arr[][] = {{1,2,3},{4,5},{7,8,9,5}}; //each entry in one row
		//printing 2d array
		for(int i=0; i<arr.length; i++) { //row=0 || r=1 ||row=2
         for(int j = 0; j < arr[i].length; j++) { //row=0, col=3 || row=1, col=2 ||row=2, col=4
       System.out.println(arr[i][j]+" ");
			
		}

	}
		char[] charArr[] = {{'a','b'},{'e','c','d'},{'x','y','z'}};
		for(int i = 0; i<charArr.length; i++) {
			for(int j = 0; j<charArr[i].length; j++) {
				System.out.println(charArr[i][j]);
			}
			System.out.println();
		}

}
}
