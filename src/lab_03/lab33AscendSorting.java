package lab_03;

public class lab33AscendSorting {

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

        System.out.print("Ascending sorted array: {");
        for (int i1 = 0; i1 < myArr33.length; i1++) {
            System.out.print(" " + myArr33[i1]);
        }
        System.out.print(" }");

    }
}
