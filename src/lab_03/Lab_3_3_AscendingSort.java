package lab_03;

import java.util.Arrays;

public class Lab_3_3_AscendingSort {

    public static void main(String[] args) {

        int[] myArr33 = new int[]{15, 0, 6, 9, 21};

        for (int i1 = 0; i1 < myArr33.length; i1++) {
            for (int i2 = i1 + 1; i2 < myArr33.length; i2++) {
                if (myArr33[i1] > myArr33[i2]) {
                    int a = myArr33[i1];
                    myArr33[i1] = myArr33[i2];
                    myArr33[i2] = a;
                }
            }
        }

        System.out.println("Ascending sorted array: " + Arrays.toString(myArr33));

//        System.out.print("Ascending sorted array: {");
//        for (int i1 = 0; i1 < myArr33.length; i1++) {
//            System.out.print(" " + myArr33[i1]);
//        }
//        System.out.print(" }");

    }
}
