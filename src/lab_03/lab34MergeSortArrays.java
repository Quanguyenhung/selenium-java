package lab_03;

public class lab34MergeSortArrays {

    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 12, 16, 28, 34};
        int[] arr2 = new int[]{1, 13, 16, 27, 99};
        int[] arr3 = new int[arr1.length + arr2.length];

        //Merging
        for (int i1 = 0; i1 < arr1.length; i1++) {
            arr3[i1] = arr1[i1];
        }

        for (int i3 = arr1.length; i3 < arr3.length; i3++) {
            int i2 = i3 - arr1.length;
            arr3[i3] = arr2[i2];
        }

        //Sorting
        for (int i1 = 0; i1 < arr3.length; i1++) {
            for (int i2 = i1 + 1; i2 < arr3.length; i2++) {
                if (arr3[i1] > arr3[i2]) {
                    int a = arr3[i1];
                    arr3[i1] = arr3[i2];
                    arr3[i2] = a;
                }

            }

        }
        System.out.println("Merged and sorted array:");
        for (int i4 = 0; i4 < arr3.length; i4++) {
            System.out.print(" " + arr3[i4]);
        }

    }

}
