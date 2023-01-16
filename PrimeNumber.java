import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        // int num = 29;
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean flag = false;
        for(int i = 2; i <= Math.sqrt(num); i++)
        {
            // condition for nonprime number
            if(num % 2 == 0 || num % 3 == 0 || num % 5 == 0)
            {
                flag = true;
                break;
            }
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

        scanner.close();
    }
}
//write a program to find prime numbers in java" 
