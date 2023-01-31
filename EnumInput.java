import java.util.Scanner;

enum Color {
    RED, GREEN, BLUE
}

public class EnumInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a color: ");
        String input = scanner.nextLine();
        Color color = Color.valueOf(input.toUpperCase());
        System.out.println("You have chosen: " + color);
        scanner.close();
    }
}

