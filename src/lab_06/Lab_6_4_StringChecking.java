package lab_06;

public class Lab_6_4_StringChecking {

    public static void main(String[] args) {

        String url = "httpsk://google.com";
        stringCheck(url, "http", "https");
        stringCheck(url, ".com", ".net");
    }

    private static void stringCheck(String checkString, String checkValue1, String checkValue2) {

        String checkValue3 = checkValue1;
        if (checkValue1.length() < checkValue2.length()){
            checkValue1 = checkValue2;
            checkValue2 = checkValue3;
        }

        if (checkString.contains(checkValue1)) {
            System.out.printf("This url contains %s.\n", checkValue1);
        } else if (checkString.contains(checkValue2)){
            System.out.printf("This url contains %s.\n", checkValue2);
        } else {
            System.out.printf("This url does not contain %s or %s.\n", checkValue1, checkValue2);
        }
    }
}