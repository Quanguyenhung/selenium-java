package lab_03;

import java.security.SecureRandom;
import java.util.Scanner;

public class WhileLoopLearning {

    public static void main(String[] args) {

        while (true) {
            System.out.println("======Game Menu=====");
            System.out.println("1. Generate a random number (less than 1000)");
            System.out.println("0. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Please select an option: ");
            int option = scanner.nextInt();
            System.out.println();

            if (option == 0){
                System.out.println("See you again!");
                break;
            } else if (option == 1){
                System.out.println("Your random number is " + new SecureRandom().nextInt(1000));
                System.out.println();
            } else {
                System.out.println("Nhap sai roi, nhap lai di ban oi!");
            }
        }
    }
}
