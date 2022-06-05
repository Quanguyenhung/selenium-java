package lab_06;

import java.util.Scanner;

public class Lab_6_2_PasswordInput {

    public static void main(String[] args) {

        String myPassword = "a123";
        int incorrectTime = 0;

        System.out.print("Please input your password: ");
        while (incorrectTime < 3){
            Scanner scanner = new Scanner(System.in);
            String userInputPassword = scanner.next();

            if (myPassword.equals(userInputPassword)){
                System.out.println("Welcome back!");
                break;
            } else if (incorrectTime == 2){
                System.out.println("You have input incorrect password for 3 times.\n" +
                                "Your account was locked!");
                break;
            } else {
                System.out.print("Incorrect password! Please input your password again: ");
                incorrectTime++;
            }
        }
    }
}