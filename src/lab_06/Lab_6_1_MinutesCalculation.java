package lab_06;

import java.util.Arrays;

public class Lab_6_1_MinutesCalculation {

    public static void main(String[] args) {

        String givenTimeStr = "10hrs and 15 minutes";
        String[] givenTimeSplit = givenTimeStr.split("and");

        String givenHrsNumStr = givenTimeSplit[0].replaceAll("\\D", "");
        String givenMinutesNumStr = givenTimeSplit[1].replaceAll("\\D", "");

        int givenHrs = Integer.parseInt(givenHrsNumStr);
        int givenMinutes = Integer.parseInt(givenMinutesNumStr);
        int totalMinutes = givenMinutes + givenHrs * 60;

        System.out.println("There are " + totalMinutes + " Minutes.");

    }
}
