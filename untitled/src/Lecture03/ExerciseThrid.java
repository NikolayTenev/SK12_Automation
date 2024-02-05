package Lecture03;

    import java.util.Scanner;
public class ExerciseThrid {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter unit price: ");
            double unitPrice = scanner.nextDouble();

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            double revenue = calculateRevenue(unitPrice, quantity);
            double discount = calculateDiscount(unitPrice, quantity, revenue);
            double discountPercentage = getDiscountRate(quantity);

            System.out.println("The revenue from sale: $" + revenue);
            System.out.println("Discount: $" + discount + " (" + discountPercentage + "%)");
        }

        public static double calculateRevenue(double unitPrice, int quantity) {
            double discountRate = getDiscountRate(quantity) / 100.0;
            double discountedPrice = unitPrice * (1 - discountRate);
            return discountedPrice * quantity;
        }

        public static double calculateDiscount(double unitPrice, int quantity, double revenue) {
            double originalPrice = unitPrice;
            double discountedPricePerUnit = revenue / quantity;
            return (originalPrice - discountedPricePerUnit) * quantity;
        }

        public static double getDiscountRate(int quantity) {
            if (quantity >= 100 && quantity <= 120) {
                return 15.0;
            } else if (quantity > 120) {
                return 20.0;
            } else {
                return 0.0;
            }
        }
    }


