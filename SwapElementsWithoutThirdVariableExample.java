// This program swap two integers without using third variable
// By - Nitish Tiwari

import java.util.Scanner;
public class SwapElementsWithoutThirdVariableExample {
 
        public static void main(String[] args) {
               
                int num1,num2;
                System.out.println("Enter the two nos to swap :");
				Scanner in = new Scanner(System.in);
				num1 = in.nextInt();
				num2 = in.nextInt();
               
                System.out.println("Before Swapping");
                System.out.println("Value of num1 is :" + num1);
                System.out.println("Value of num2 is :" + num2);
               
                
                num1 = num1 + num2;
                num2 = num1 - num2;
                num1 = num1 - num2;
               
                System.out.println("After Swapping");
                System.out.println("Value of num1 is :" + num1);
                System.out.println("Value of num2 is :" + num2);
        }
 
 
}