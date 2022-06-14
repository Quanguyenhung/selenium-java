package lab_06;

import java.util.Scanner;

public class Lab_6_2_PasswordInput {

    public static void main(String[] args) {

        String myPassword = "a123";
        int incorrectTimeMax = 3;
        int incorrectTimeCount = 0;

        System.out.print("Please input your password: ");
        while (incorrectTimeCount < incorrectTimeMax) {
            Scanner scanner = new Scanner(System.in);
            String userInputPassword = scanner.nextLine();

            if (myPassword.equals(userInputPassword)) {
                System.out.println("Welcome back!");
                break;

            } else if (incorrectTimeCount == (incorrectTimeMax - 1)) {
                System.out.printf("You have input incorrect password for %d times.\n" +
                        "Your account was blocked!", incorrectTimeMax);
                break;

            } else {
                System.out.print("Incorrect password! Please input your password again: ");
                incorrectTimeCount++;
            }
        }
    }
}