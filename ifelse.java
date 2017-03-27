// This program is an example of ifElse statemnt
// Date - 23/03/2017
// By - Nitish Tiwari

import java.util.Scanner;
public class ifelse{
	public static void main(String args[]){
	int l,b,area;
	System.out.println("Enetr the parameters of square :");
	Scanner in = new Scanner(System.in);
	l = in.nextInt();
	b = in.nextInt();
	area= l*b;
	if(l==b){
		System.out.print("The area of the square is :\t" +area);
	}
	else{
		System.out.println("This is not a square");
	}
	}
	

}