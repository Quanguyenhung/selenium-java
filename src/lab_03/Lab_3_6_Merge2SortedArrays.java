package lab_03;

import java.util.Arrays;

public class Lab_3_6_Merge2SortedArrays {

    public static void main(String[] args) {

        int[] myArr1 = new int[]{1, 3, 5, 9,10,11,12};
        int[] myArr2 = new int[]{2, 5, 7, 8, 9};
        int arr1Length = myArr1.length;
        int arr2Length = myArr2.length;
        int[] mergedArr = new int[arr1Length+arr2Length];
        int arr1Index = 0;
        int arr2Index = 0;
        int mergedArrIndex = 0;

        while (arr1Index < arr1Length && arr2Index < arr2Length) {
            if (myArr1[arr1Index] < myArr2[arr2Index]) {
                mergedArr[mergedArrIndex] = myArr1[arr1Index];
                arr1Index++;
            } else {
                mergedArr[mergedArrIndex] = myArr2[arr2Index];
                arr2Index++;
            }
            mergedArrIndex++;
        }

        while (arr1Index < arr1Length){
            mergedArr[mergedArrIndex] = myArr1[arr1Index];
            arr1Index++;
            mergedArrIndex++;
        }

        while (arr2Index < arr2Length){
            mergedArr[mergedArrIndex] = myArr2[arr2Index];
            arr2Index++;
            mergedArrIndex++;
        }

        System.out.println(Arrays.toString(mergedArr));
    }
}

