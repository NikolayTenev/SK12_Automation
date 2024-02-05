package Lecture03;

    import java.util.Scanner;
public class FirstExercise {




        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a digit from 1 to 7: ");
            int userInput = scanner.nextInt();

            printDayOfWeek(userInput);
        }

        public static void printDayOfWeek(int userInput) {
            String day;

            switch (userInput) {
                case 1:
                    day = "Monday";
                    break;
                case 2:
                    day = "Tuesday";
                    break;
                case 3:
                    day = "Wednesday";
                    break;
                case 4:
                    day = "Thursday";
                    break;
                case 5:
                    day = "Friday";
                    break;
                case 6:
                    day = "Saturday";
                    break;
                case 7:
                    day = "Sunday";
                    break;
                default:
                    System.out.println("Invalid input. Please enter a digit between 1 and 7.");
                    return;
            }


            System.out.println("The " + userInput + " " + "is a" + " " + day + ".");
        }
    }

