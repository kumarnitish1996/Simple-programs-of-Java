// This program calculate factorial of an integer no.
// By - Nitish Tiwari

import java.util.Scanner;
public class factorial{
	public static void main(String args[]){
		int n,c,fact=1;
		System.out.print("Enter the no. :\t");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		if(n<0){
			System.out.println("Number Should be non-negative");
		}
		else
		{
			for(c=1;c<=n;c++){
				fact=fact*c;
			}
			System.out.println("The factorial of "+n+" is = "+ fact);
		}
	}
}