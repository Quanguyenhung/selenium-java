package lab_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab_04 {

    public static void main(String[] args) {

        List<Integer> userList = new ArrayList<>();
        int userListSize = 5;
        int userOption;
        boolean isContinueToPlay = true;

        while (isContinueToPlay) {

            createMenu();
            System.out.print("Please choose an option: ");
            userOption = getUserNumber();

            switch (userOption) {

                case 1: //add numbers into array list
                    System.out.print("Please add a number and your array list will be automatically created: ");
                    int userNumber = getUserNumber();

                    userList.add(userNumber);
                    for (int index = 0; index < userListSize; index++) {
                        userList.add(userNumber + index + 1);
                    }
                    break;

                case 2: //print numbers
                    System.out.print("Numbers in your array list: ");
                    for (Integer userNumbers : userList) {
                        System.out.print(" " + userNumbers);
                    }
                    System.out.println();
                    break;

                case 3: //get max
                    if (userList.isEmpty()) {
                        System.out.println("Please add numbers to your array list!");
                    }
                    int maxValue = getMax(userList);
                    System.out.printf("Maximum value is %d.\n", maxValue);
                    break;

                case 4: //get min

                    if (userList.size() == 0) {
                        System.out.println("Please add numbers to your array list!");
                    }
                    int minValue = getMin(userList);
                    System.out.printf("Minimum value is %d.\n", minValue);
                    break;

                case 5: //search number index
                    if (userList.size() == 0) {
                        System.out.println("Please add numbers to your array list!");
                    }

                    System.out.print("Please input the number you want to find: ");
                    int userFindNumber = getUserNumber();
                    boolean isInList = userList.contains(userFindNumber);

                    if (!isInList) {
                        System.out.printf("%d is not in your array list.\n", userFindNumber);
                    } else {
                        System.out.printf("The index of %d is", userFindNumber);
                        for (int index = 0; index < userList.size(); index++) {
                            if (userFindNumber == userList.get(index)) {
                                System.out.print(" " + index);
                            }
                        }
                    }
                    System.out.println();
                    break;

                case 6: //exit
                    boolean isContinue = true;
                    while (isContinue) {
                        System.out.println("Do you want to exit?");
                        System.out.println("1.Yes");
                        System.out.println("2.No");
                        int exitOption = getUserNumber();

                        switch (exitOption) {
                            case 1:
                                System.out.println("See you again!");
                                isContinue = false;
                                isContinueToPlay = false;
                                break;

                            case 2:
                                System.out.println("Return to menu.");
                                isContinue = false;
                                break;

                            default:
                                System.out.println("Please choose again!");
                        }
                    }
            }
        }
    }

    private static int getMax(List<Integer> userList) {
        int maxValue = userList.get(0);
        for (Integer number : userList) {
            if (maxValue < number) {
                maxValue = number;
            }
        }
        return maxValue;
    }

    private static int getMin(List<Integer> userList) {
        int minValue = userList.get(0);
        for (Integer number : userList) {
            if (minValue > number) {
                minValue = number;
            }
        }
        return minValue;
    }

    private static void createMenu() {

        System.out.println("    =====MENU=====");
        System.out.println("1. Add numbers into array list");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Search number index");
        System.out.println("6. Exit");
    }

    private static int getUserNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}