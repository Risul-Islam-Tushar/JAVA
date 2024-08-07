import java.util.Scanner;
public class java_06 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double balance = 1000.00;

            while (true) {
                System.out.println("ATM Menu:");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Exit");
                System.out.print("Choose an option (1-3): ");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.printf("Your current balance is: $%.2f%n", balance);
                }
                else if (choice == 2) {

                    System.out.print("Enter the amount to withdraw: ");
                    double amount = scanner.nextDouble();

                    if (amount <= balance) {
                        balance -= amount;
                        System.out.printf("You have withdrawn $%.2f. Your new balance is $%.2f%n", amount, balance);
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                } else if (choice == 3) {
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                } else {
                    System.out.println("Invalid choice! Please choose a valid option.");
                }
            }

        }


}
