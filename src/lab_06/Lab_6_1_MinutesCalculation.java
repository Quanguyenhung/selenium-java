package lab_06;

public class Lab_6_1_MinutesCalculation {

    public static void main(String[] args) {

        String givenTimeStr = "10hrs and 15 minutes";
        String[] givenTimeSplit = givenTimeStr.split("and");

        String givenHrsNumStr = givenTimeSplit[0].replaceAll("[^0-9]", "");
        String givenMinutesNumStr = givenTimeSplit[1].replaceAll("\\D", "");

        int totalMinutes = Integer.parseInt(givenMinutesNumStr) + Integer.parseInt(givenHrsNumStr)*60;

        System.out.println("There are " + totalMinutes + " Minutes.");
    }
}