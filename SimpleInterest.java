// This program calculate Simple Interest
// Date - 22/03/2017
// By - Nitish Tiwari

import java.util.Scanner;
public class SimpleInterest{
	public static void main(String args[]){
	int p,r,t;
	float SI;
	System.out.println("Enetr the Principal amount, Rate, Time :");
	Scanner in = new Scanner(System.in);
	p = in.nextInt();
	r = in.nextInt();
	t = in.nextInt();
	SI=((p*r*t)/100);
	System.out.print("The Simple Interest is :\t" +SI);
}
}

