import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // int num = 29;
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println(num1 + num2);
        } else {
            System.out.println(num1 > num2 ? num1 - num2 : num2 - num1);
        }

        scanner.close();
    }
}
