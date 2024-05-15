import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static String output;

    public static void main(String[] args) throws InputMismatchException {  // Added "throws InputMismatchException"
        Scanner scanner = new Scanner(System.in);
        int num;

        if (args.length > 0) {
            num = Integer.parseInt(args[0]);
        } else {
            System.out.print("Enter a number: ");
            try{
                num = scanner.nextInt();
            }
            catch(InputMismatchException e){
                //If the input is not a valid number throw an InputMismatchException
                throw new InputMismatchException("Invalid input. Please enter a number.");
            }
        }

        String result = (num % 2 == 0) ? "Even" : "Odd";

        output = "The number " + num + " is " + result;
        System.out.println(output);
        scanner.close();
    }

    public static String getOutput() {
        return output;
    }
}
