package lab_02;

import java.util.Scanner;

public class Lab_2_2_Even_Odd_Determination {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a integer number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println(number + " is an even number.");
        } else
            System.out.println(number + " is an odd number.");

    }
}
