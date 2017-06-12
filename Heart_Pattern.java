// This program draw a heart like shape made of asterisk
// By - Nitish Tiwari


import java.util.Scanner;

public class Heart_Pattern
{
    public static void main(String args[])
    {
         
    int i, j, n;
	
	Scanner in = new Scanner (System.in);
 
    System.out.print("Enter the no. of lines :\t ");
		
    n = in.nextInt();
	
    for(i=n/2; i<=n; i+=2)
    {
        for(j=1; j<n-i; j+=2)
        {
            System.out.print(" ");
        }
 
        for(j=1; j<=i; j++)
        {
            System.out.print("*");
        }
 
        for(j=1; j<=n-i; j++)
        {
            System.out.print(" ");
        }
 
        for(j=1; j<=i; j++)
        {
            System.out.print("*");
        }
 
			System.out.print("\n");
    }
 
    for(i=n; i>=1; i--)
    {
        for(j=i; j<n; j++)
        {
            System.out.print(" ");
        }
 
        for(j=1; j<=(i*2)-1; j++)
        {
            System.out.print("*");
        }
 
        System.out.print("\n");
		}
 
	} 

}
