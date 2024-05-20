import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static String output;

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isEven(number)) {
            System.out.println("The number " + number + " is Even");
        } else {
            System.out.println("The number " + number + " is Odd");
        }
        scanner.close();
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
}
