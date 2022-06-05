package lab_06;

public class Lab_6_4_StringChecking {

    public static void main(String[] args) {
        String url = "http://google.vn";

        if (url.contains("https")) {
            System.out.println("This url contains https.");
        } else if (url.contains("http")) {
            System.out.println("This url contains http.");
        } else {
            System.out.println("This url does not contain http or https.");
        }

        if (url.contains(".com")) {
            System.out.println("This url domain is .com");
        } else if (url.contains(".net")) {
            System.out.println("This url domain is .net");
        } else {
            System.out.println("This url domain is neither .com nor .net.");
        }
    }
}
