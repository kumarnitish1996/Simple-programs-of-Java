import java.util.Scanner;

public class Prime_till_limit {
    public static void main(String args[]) {


        System.out.println("Enter the number till which prime number to be printed: ");
        int limit = new Scanner(System.in).nextInt();


        System.out.println("Printing prime number from 1 to " + limit);
        for(int number = 2; number <= limit; number ++){

            if(isPrime(number)){
                System.out.println(number);
            }
        }
    }

    public static boolean isPrime(int number){

        int n=0;

        if (number % 2 == 0){
            return false;
        }

        for (int i = 3; i < Math.sqrt(n); i+=2){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }
}