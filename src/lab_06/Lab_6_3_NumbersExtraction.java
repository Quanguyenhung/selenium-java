package lab_06;

import com.sun.xml.internal.ws.util.StringUtils;

public class Lab_6_3_NumbersExtraction {

    public static void main(String[] args) {

        String myStr = "123dsfds546";

/*        String[] myStrSplit = myStr.split("");

        for (String string : myStrSplit) {
            if (string.equals("0") || string.equals("1") || string.equals("2") ||
                    string.equals("3") || string.equals("4") || string.equals("5") ||
                    string.equals("6") || string.equals("7") || string.equals("9")) {
                System.out.print(string);
            }
        }*/

        for (char character : myStr.toCharArray()) {
            if (Character.isDigit(character)){
                System.out.print(character);
            }
        }



    }
}
