package conditionalstate;

public class leapyear {

	public static void main(String[] args) {
		int year= 2024; //declare and initialize
		
		//check if the year is leap year or not
		if ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0))
		{
			System.out.println(" leap year:"+ year);
			
		}else {
			System.out.println("it is not leap year:"+ year);
		}
		
	}

}
     
