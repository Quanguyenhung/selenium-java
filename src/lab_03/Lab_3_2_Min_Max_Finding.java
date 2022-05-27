package lab_03;

public class Lab_3_2_Min_Max_Finding {

    public static void main(String[] args) {

        int[] myArr32 = new int[]{1,1,1,1,2};
        int minValue = myArr32[0];
        int maxValue = myArr32[0];

        for (int index = 1; index < myArr32.length; index++) {
            if (minValue > myArr32[index]){
                minValue = myArr32[index];
            }

            if (maxValue < myArr32[index]){
                maxValue = myArr32[index];
            }

        }

        if (maxValue == minValue){
            System.out.println("All numbers in this array are " + minValue + ".");
        } else {
            System.out.println("Minimum value: " + minValue);
            System.out.println("Maximum value: " + maxValue);
         }
    }
}
