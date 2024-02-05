import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner stringScanner = new Scanner(System.in);
        System.out.println("Choose montain or beach: ");

        String choice = stringScanner.nextLine();


        System.out.println("Enter your daily budget: ");
        int budgetPerDay = stringScanner.nextInt();

        holidayAdvice(choice, budgetPerDay);
    }

    public static void holidayAdvice(String choice, int budgetPerDay) {

        if (choice.equalsIgnoreCase("beach")) {
            if (budgetPerDay <= 50) {
                System.out.println("I advise Bulgaria as a beach destination");
            } else {
                System.out.println("I advise outside Bulgaria as a beach destination");
            }
        } else if (choice.equalsIgnoreCase("montain")) {
            if (budgetPerDay <= 30) {
                System.out.println("I advise Bulgaria as a montain destination");
            } else {
                System.out.println("I advise outside Bulgaria as a montain destination");
            }
        } else {
            System.out.println("There is no information about this type of vacation");

        }
    }
}



