package ImportantPrograms;

public class DuplicatsArrayElemnt {

	public static void main(String[] args) {
	//	Write a java program to find duplicate elements in the given array.
		int[] arr = {1,5,3,2,1,8,2,9,8};
		int count=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(arr[i]);
				count=0;
			}
		}

	}

}
