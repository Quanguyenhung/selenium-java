package lab_05;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLearning {

    public static void main(String[] args) {

        List<Integer> myArrList = new ArrayList<>();
        myArrList.add(1);
        myArrList.add(2);
        myArrList.add(3);
        myArrList.add(4);
        myArrList.add(4);

        int arrListSize = myArrList.size();

        //Turn odd number into even number

        for (int index = 0; index < arrListSize; index++) {
            int currentNumber = myArrList.get(index);

            if (currentNumber % 2 != 0) {
                myArrList.set(index, currentNumber + 1);

            }
        }
        System.out.println(myArrList);

        // Remove 4 from array list
        for (int index = 0; index < myArrList.size(); index++) {
            int currentNumber = myArrList.get(index);

            if (currentNumber == 4){
                myArrList.remove(new Integer(4));
                index--;
            }
        }


        System.out.println(myArrList);
    }
}
