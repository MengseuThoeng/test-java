import java.util.Scanner;

public class Main {

    private static String output; // Field to store output for testing

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        String result = (num % 2 == 0) ? "Even" : "Odd";

        output = "The number " + num + " is " + result;
        System.out.println(output);
    }

    // Getter method for output (needed for testing)
    public static String getOutput() {
        return output;
    }
}
