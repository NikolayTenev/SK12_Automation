package Lecture03;

    import java.util.Scanner;
public class ExerciseFourth {




        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of element in the array: ");
            int n = scanner.nextInt();

            int[] numbers = new int[n];

            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
            }

            int LergestNumber = findLargestNumber(numbers);
        }

        public static int findLargestNumber(int[] array) {
            if (array.length == 0) {
                System.out.println("The aaray is empty.");
                return Integer.MIN_VALUE;
            }

            int max = array[0];

            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            System.out.println("The largest number of the array is a: " + max);
            return max;
        }

    }



