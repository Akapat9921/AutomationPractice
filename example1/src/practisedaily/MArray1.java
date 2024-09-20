package practisedaily;

public class MArray1 {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];//3 row and 3 column
		System.out.println("Total rows in array: "+arr.length);//row count
		System.out.println("col in row0 is: "+arr[0].length);
        for(int i=0; i<arr.length;i++) {    //row count
        	for(int j=0; j<arr[i].length;j++ ) {  //cell count on each row
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        	
        }
	}

}
