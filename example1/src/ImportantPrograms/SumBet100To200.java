package ImportantPrograms;

public class SumBet100To200 {

	public static void main(String[] args) {
		//Write a program to find sum of all integers greater than 100 and less than 200 that are divisible by 7
        int num=200, ct=0, sum=0;
        for(int i=101; i<200; i++) {
        	if(i%7==0) {
        		sum = sum+i;
        		ct++;
        	}
        }
        System.out.println("sum of all integers greater than 100 and less than 200 that are divisible by 7 is: "+sum);
        System.out.println("count of all integers greater than 100 and less than 200 that are divisible by 7 is: "+ct);
	}

}
