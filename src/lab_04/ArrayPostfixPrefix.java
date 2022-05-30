package lab_04;

public class ArrayPostfixPrefix {

    public static void main(String[] args) {

        int arrLength = 5;
        int[] myIntArr = {9,9,9,9,9};

        for (int index = 0; index < arrLength; ) {
            myIntArr[index++] = index;

        }

        for (int index = 0; index < arrLength; index++) {
            System.out.printf("index %d; value %d\n" , index, myIntArr[index]);
        }
    }
}
