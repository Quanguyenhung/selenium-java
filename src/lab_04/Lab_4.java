package lab_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab_4 {

    public static void main(String[] args) {

        List<Integer> userList = new ArrayList<>();
        createMenu();

        int userListSize = 10;
        int userOption = 0;
        boolean isContinue = true;

        while (userOption != 7) {
            System.out.print("Please choose an option: ");
            userOption = getUserInput();

            switch (userOption) {
                case 1: //add numbers into array list
                    System.out.print("Please add a number and your array list will be automatically created: ");
                    int userNumber = getUserInput();
                    userList.add(userNumber);
                    for (int index = 0; index < userListSize; index++) {
                        userList.add(userNumber + index + 1);
                    }
                    createMenu();
                    break;

                case 2: //print numbers
                    System.out.print("Numbers in your array list: ");
                    for (Integer userNumbers : userList) {
                        System.out.print(" " + userNumbers);
                    }
                    System.out.println("");
                    createMenu();
                    break;

                case 3: //get max
                    if (userList.size() == 0){
                        System.out.println("Please add numbers to your array list!");
                        createMenu();
                        break;
                    }
                    int maxValue = userList.get(0);
                    for (int index = 0; index < userList.size(); index++) {
                        maxValue = userList.get(index);
                        if (maxValue < userList.get(index)) {
                            maxValue = userList.get(index);
                        }
                    }
                    System.out.printf("Maximum value is %d.\n", maxValue);
                    createMenu();
                    break;

                case 4: //get min
                    if (userList.size() == 0){
                        System.out.println("Please add numbers to your array list!");
                        createMenu();
                        break;
                    }
                    int minValue = 0;
                    for (int index = 0; index < userList.size(); index++) {
                        minValue = userList.get(0);
                        if (minValue > userList.get(index)) {
                            minValue = userList.get(index);
                        }
                    }
                    System.out.printf("Minimum value is %d.\n", minValue);
                    createMenu();
                    break;

                case 5: //search number index
                    if (userList.size() == 0){
                        System.out.println("Please add numbers to your array list!");
                        createMenu();
                        break;
                    }
                    System.out.print("Please input the number you want to find: ");
                    int userFindNumber = getUserInput();
                    int isInArray = 0;

                    for (int index = 0; index < userList.size(); index++) {
                        if (userFindNumber == userList.get(index)) {
                            System.out.printf("The index of %d is %d.\n", userFindNumber, index);
                            isInArray = index + 1;
                        }
                    }
                    if (isInArray == 0) {
                        System.out.printf("%d is not in your array list.\n", userFindNumber);
                    }

                    createMenu();
                    break;
                case 6: //reset

                    while (isContinue){
                        System.out.println("Do you want to reset array list?");
                        System.out.println("1.Yes");
                        System.out.println("2.No");
                        int reset = getUserInput();

                        switch (reset){
                            case 1:
                                System.out.println("Your array list was reset.");
                                isContinue = false;
                                for (int index = 0; index < userList.size(); ) {
                                    userList.remove(index);
                                }
                                createMenu();
                                break;
                            case 2:
                                System.out.println("Your array will not be reset!");
                                isContinue = false;
                                createMenu();
                                break;
                            default:
                                System.out.println("Please choose again!");
                        }
                    }
                    isContinue = true;

                case 7: //exit
                    while (isContinue){
                        System.out.println("Do you want to exit?");
                        System.out.println("1.Yes");
                        System.out.println("2.No");
                        int reset = getUserInput();

                        switch (reset){
                            case 1:
                                System.out.println("See you again!");
                                isContinue = false;
                                break;
                            case 2:
                                System.out.println("Return to menu.");
                                isContinue = false;
                                userOption = 1;
                                createMenu();
                                break;
                            default:
                                System.out.println("Please choose again!");
                        }
                    }
                    isContinue = true;

                default:
                    if (userOption > 7) {
                        System.out.println("Please choose again!");
                        createMenu();
                    }
//                    else {
//                        System.out.println("There is nothing in your list.");
//                        System.out.println("Please add numbers into your array list or exit.");
//                    }
            }
        }
    }

    private static void createMenu() {

        System.out.println("    =====MENU=====");
        System.out.println("1. Add numbers into array list");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Search number index");
        System.out.println("6. Reset array list");
        System.out.println("7. Exit");
    }

    private static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        return userInput;
    }
}