// This program perform simple Arithmetic operations using Switch Case
// By - Nitish Tiwari

import java.util.Scanner;
class Calculator{
    public static void main(String[] args) 
    { 
        Scanner s=new Scanner(System.in);
        System.out.println("YOU HAVE FOLLOWING CHOICES : ");
        System.out.println("1. ADDITION");
        System.out.println("2. SUBTRACTION ");
        System.out.println("3. MULTIPLICATION ");
        System.out.println("4. DIVISION");
        System.out.print("ENTER YOUR CHOICE :\t ");
        int i = s.nextInt();
           
        System.out.print("ENTER FIRST NUMBER :\t");
        float a = s.nextInt();
           
        System.out.print("ENTER SECOND NUMBER :\t");
        float b = s.nextInt();
           
        double result=0;	//'result' will store the result of operation
           
        switch(i)
        {
            case 1:
                result = a+b;
                break;
            case 2:
                result = a-b;
                break;
            case 3:
                result = a*b;
                break;
            case 4:
                if(b==0)//when denominator becomes zero
                {
                    System.out.println("DIVISION IS NOT POSSIBLE");
                    break;
                }
                else
				{
                    result = a/b;
					break;
				}
            default:
                System.out.println("YOU HAVE ENTERED A WRONG CHOICE");
            
        }
        System.out.println("RESULT = "+result);
    }
}