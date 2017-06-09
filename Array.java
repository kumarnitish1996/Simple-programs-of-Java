// This program shows how to implement Array
// By - Nitish Tiwari

public class Array {

	public static void main(String []args){
		
		int month_days[];	// Declaration of array
		month_days = new int[13];	// Allocating memory to array
		
		month_days[0] = 31;
		month_days[1] = 28;
		month_days[2] = 31;
		month_days[3] = 30;
		month_days[4] = 31;
		month_days[5] = 30;
		month_days[6] = 31;
		month_days[7] = 30;
		month_days[8] = 31;
		month_days[9] = 30;
		month_days[10] = 31;
		month_days[11] = 30;
		month_days[12] = 31;
		
		
		
		System.out.println("April has " + month_days[3] + " days.");
		System.out.println("January has " + month_days[0] + " days.");

			
	}

}