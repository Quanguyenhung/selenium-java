package lab_02;

import java.util.Scanner;

public class lab22EvenOddDetermination {

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
