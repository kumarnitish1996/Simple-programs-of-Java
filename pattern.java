// This program draw a triangle pattern that can be changed by changing the conditions of for loop
// By - Nitish Tiwari

import java.util.Scanner;
public class pattern{
	public static void main(String args[]){
		int i,j,n;
		System.out.print("Enetr the no. of lines :");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
			}
		}
	}
