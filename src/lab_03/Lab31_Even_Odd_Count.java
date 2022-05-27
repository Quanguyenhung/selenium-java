package lab_03;

public class Lab31_Even_Odd_Count {
    public static void main(String[] args) {

        int[] myArr31 = {1, 2, 3, 4, 5};
        int evenNumCounts = 0;
        int oddNumCounts = 0;

        for (int index = 0; index < myArr31.length; index++) {
            if (myArr31[index] % 2 == 0){
                evenNumCounts = evenNumCounts + 1;
            } else oddNumCounts = oddNumCounts + 2;
        }

        System.out.println("Even numbers: " + evenNumCounts);
        System.out.println("Odd numbers: " + oddNumCounts);

    }

}
