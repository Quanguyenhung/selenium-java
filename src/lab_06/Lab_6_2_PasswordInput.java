package lab_06;

import java.util.Scanner;

public class Lab_6_2_PasswordInput {

    public static void main(String[] args) {

        String myPassword = "a123";
        int incorrectTime = 0;

        while (incorrectTime < 3){
            System.out.print("Please input your password: ");
            String userInputPassword = userInput();

            if (myPassword.equals(userInputPassword)){
                System.out.println("Welcome back!");
                break;
            } else if (incorrectTime == 2){
                System.out.print("You have input incorrect password for 3 times. Your account was blocked!");
                break;
            } else {
                System.out.print("Incorrect password! ");
                incorrectTime++;
            }
        }
    }

    private static String userInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
