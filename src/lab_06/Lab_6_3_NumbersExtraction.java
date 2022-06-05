package lab_06;

public class Lab_6_3_NumbersExtraction {

    public static void main(String[] args) {

        String myStr = "123aaa546";

        // Cach 1
        String[] myStrSplit = myStr.split("");
        for (String string : myStrSplit) {
            if (string.equals("0") || string.equals("1") || string.equals("2") ||
                    string.equals("3") || string.equals("4") || string.equals("5") ||
                    string.equals("6") || string.equals("7") || string.equals("9")) {
                System.out.print(string);
            }
        }

        System.out.println();

        // Cach 2
        for (char character : myStr.toCharArray()) {
            if (Character.isDigit(character)){
                System.out.print(character);
            }
        }
    }
}