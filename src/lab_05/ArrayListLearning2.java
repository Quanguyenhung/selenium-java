package lab_05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListLearning2 {

    public static void main(String[] args) {

        List<Integer> myArrList = new ArrayList<>();
        myArrList.add(1);
        myArrList.add(4);
        myArrList.add(2);
        myArrList.add(3);
        myArrList.add(4);

        //Lay ra 3 gia tri nho nhat dau tien ma khong bi trung
        //Cach 1

      /*  List<Integer> withoutDuplicatedValues = new ArrayList<>();
        for (int value : myArrList) {
            if (!withoutDuplicatedValues.contains(value)){
                withoutDuplicatedValues.add(value);
            }
        }
        System.out.println(myArrList);
        System.out.println(withoutDuplicatedValues);*/

        //dua du lieu vao set
        Set<Integer> set = new HashSet<>(myArrList);
        System.out.println("Set:        " + set);

        //dua du lieu vao array list
        List<Integer> arrayListWithSet = new ArrayList<>(set);
        System.out.println("Array list: " + arrayListWithSet);

        //lay 1 phan cua array list - subList(fromIndex, toIndex),
        // toIndex: exclusive index, chi la gioi han, khong bao gom gia tri trong sub list
        List<Integer> first3MinValues = arrayListWithSet.subList(0, 3);
        System.out.println("Sub list:   " + first3MinValues);

    }
}