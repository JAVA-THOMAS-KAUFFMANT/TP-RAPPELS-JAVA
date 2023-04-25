import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        boolean game = true;

        while(game) {
            // Generate random number
            Random r = new Random();
            int numberOne = r.nextInt(10-1) + 1;
            int numberTwo = r.nextInt(10-1) + 1;

            // Print Multiplication
            System.out.println("=> : " + numberOne + " x " + numberTwo);

            Scanner in = new Scanner(System.in);

            int s = Integer.parseInt(in.nextLine());

            multiplication felix = new multiplication();
            boolean result = felix.checkResult(numberOne, numberTwo, s);

            if (result == true) {
                System.out.println("Correct !");
            } else {
                System.out.println("Incorrect...");
            }
        }
    }
}