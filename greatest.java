// This program compares three integers & find the greatest out of them
// By - Nitish Tiwari

import java.util.Scanner;
class greatest{
	public static void main(String args[]){
		int a,b,c;
		System.out.print("Enter the three nos to compare : \t");
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
	if(a>b)
	{
		if(a>c){
			System.out.println("The greatest is = " +a);
		}
		else{
			System.out.println("The greatest is = " +c);
		}
	}
	else{
		if(c>b){
			System.out.println("The greatest is = " +c);
		}
		else{
			System.out.println("The greatest is = " +b);
		}
	}
}
}