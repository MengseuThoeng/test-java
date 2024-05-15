import java.util.Scanner;

public class Main {

    private static String output;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if(args.length > 0) {
            // get the input from argument if present
            int num = Integer.parseInt(args[0]);
            String result = (num % 2 == 0) ? "Even" : "Odd";

            output = "The number " + num + " is " + result;
            System.out.println(output);
        } else {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            String result = (num % 2 == 0) ? "Even" : "Odd";

            output = "The number " + num + " is " + result;
            System.out.println(output);
        }
        // Remember to close the scanner
        scanner.close();

    }
    public static String getOutput() {
        return output;
    }
}
