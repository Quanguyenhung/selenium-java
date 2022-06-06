package lab_03;

import java.util.Arrays;

public class Lab_3_5_BubbleSort {

    public static void main(String[] args) {

        int[] myArr = {7,5,2,6};
        int myArrLength = myArr.length;

        for (int unsortedIndex = myArrLength - 1; unsortedIndex > 0; unsortedIndex--) {
            for (int index = 0; index < unsortedIndex; index++) {
                if (myArr[index] > myArr[index + 1]){

                    // Swap bang bien tam temp
//                    int temp = myArr[index];
//                    myArr[index] = myArr[index + 1];
//                    myArr[index + 1] = temp;

                    // Swap bang total
                    myArr[index] = myArr[index] + myArr[index + 1];
                    myArr[index + 1] = myArr[index] - myArr[index +1];
                    myArr[index] = myArr[index] - myArr[index +1];
                }
            }
        }

        System.out.println(Arrays.toString(myArr));
    }
}
