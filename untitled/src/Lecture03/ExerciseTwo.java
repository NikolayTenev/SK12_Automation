package Lecture03;

    import java.util.Scanner;
public class ExerciseTwo {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter you age:");
            int userInput = scanner.nextInt();

            printAgeForWork(userInput);

        }

        public static void printAgeForWork( int age) {



            if (age > 16) {

                System.out.println("She is a" + " " + age+ " " + " and can work");
                System.out.println("You are eligible to work.");
            } else {
                System.out.println("Yuo are not eligible to work");
            }


        }
    }


