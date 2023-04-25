import java.io.*;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        writeInAFile();
    };

    public static void gameMultiplicator() {
        boolean game = true;

        while(game) {
            // Generate random number
            Random r = new Random();
            int numberOne = r.nextInt(10-1) + 1;
            int numberTwo = r.nextInt(10-1) + 1;

            // Print Multiplication
            System.out.println("=> : " + numberOne + " x " + numberTwo);

            Scanner in = new Scanner(System.in);

            String s = in.nextLine();

            if (s.equals("stop") || s.equals("Stop") || s.equals("STOP")) {
                game = false;
                break;
            } else {
                multiplication felix = new multiplication();
                boolean result = felix.checkResult(numberOne, numberTwo, Integer.parseInt(s));

                if (result == true) {
                    System.out.println("Correct !");
                } else {
                    System.out.println("Incorrect...");
                }
            }
        }
    };

    public static void writeInAFile() {
        // Create a file
        try {
            File myObj = new File("thomasFile.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Write in a file :
        try {
            FileWriter myWriter = new FileWriter("thomasFile.txt");
            myWriter.write("Ceci est un test, Thomas test file");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Read file
        try {
            FileReader fr = new FileReader("thomasFile.txt");
            BufferedReader br = new BufferedReader(fr);
            String ligne;
            while ((ligne = br.readLine()) != null) {
                System.out.println(ligne);
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    };
}
