package Lecture03;

import java.util.Scanner;

public class ExerciseSeven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please read choose for holiday - Beach or Mountain: ");
        String holiday = scanner.nextLine();

        Scanner budget = new Scanner(System.in);
        System.out.print("Please choose budget for holiday: ");
        int Budget = scanner.nextInt();


        if (holiday.equalsIgnoreCase("Beach")) {
            if (Budget <= 50) {
                System.out.println(" I advise Bulgaria as a beach destination");
            } else {
                System.out.println(" I advise an internal beach destination");
            }
        } else if (holiday.equalsIgnoreCase("Mountain")) {
            if (Budget <= 30) {
                System.out.println("I advise Bulgaria as a Mountain destination");
            } else {
                System.out.println("I advise an internal Mountain destination");
            }
        } else {
            System.out.println(" Invalid choice. Please choose either Beach or Mountain.");
        }
    }
}
