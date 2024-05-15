import java.util.Scanner;

public class Main {

    private static String output;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        try {
            if (args.length > 0) {
                num = Integer.parseInt(args[0]);
            } else {
                System.out.print("Enter a number: ");
                num = scanner.nextInt();
            }

            String result = (num % 2 == 0) ? "Even" : "Odd";
            output = "The number " + num + " is " + result;
        } catch (NumberFormatException e) {
            output = "Invalid input. Please enter a number.";
        }
        System.out.println(output);
        scanner.close();

    }
    public static String getOutput() {
        return output;
    }
}
