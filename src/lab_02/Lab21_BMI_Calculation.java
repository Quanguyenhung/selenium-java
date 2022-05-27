package lab_02;

import java.util.Scanner;

public class Lab21_BMI_Calculation {
    public static void main(String[] args) {

        float changeWeight;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pls input your weight (kg): ");
        float currentWeight = scanner.nextFloat();
        System.out.print("Pls input your height (m): ");
        float height = scanner.nextFloat();

        float BMI = currentWeight / (height * height);

        if (BMI < 18.5){
            System.out.println("Underweight");
            changeWeight = (18.5f * height * height);
            System.out.println("You need to gain " + (changeWeight - currentWeight) + " kg.");

        } else if (BMI <= 24.9) {
            System.out.println("Normal");
            System.out.println("Wonderful! You're in good shape.");

        } else if (BMI <= 29.9) {
            System.out.println("Overweight");
            changeWeight = (24.9f * height * height);
            System.out.println("You need to lose " + (currentWeight - changeWeight) + " kg.");

        } else{
            System.out.println("Obesity");
            changeWeight = (24.9f * height * height);
            System.out.println("You need to lose " + (currentWeight - changeWeight) + " kg.");

        }

    }

}
