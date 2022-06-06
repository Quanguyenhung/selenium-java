package lab_04;

import java.security.SecureRandom;
import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {

        int randomNumber = new SecureRandom().nextInt(10);
        int guessingTime = 0;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please input a number (less than 10): ");
            int userNumber = scanner.nextInt();

            if (userNumber == randomNumber){
                System.out.println("Great!");
                break;

            } else if (userNumber > 10) {
                System.out.println("Your number is greater than 10. Please input again.");
                guessingTime--;
            }
            guessingTime++;

        } while (guessingTime < 3);

        System.out.println("Random number is " + randomNumber);
        System.out.println("See you again!");
    }
}