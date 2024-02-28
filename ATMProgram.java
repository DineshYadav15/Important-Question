/*In the ATM program, the user has to select an option from the options displayed on the
screen. The options are related to withdraw the money, deposit the money, check the
balance, and exit.To withdraw the money, we simply get the withdrawal amount from the
user and remove that amount from the total balance and print the successful
message.To deposit the money, we simply get the deposit amount from the user, add it
to the total balance and print the successful message.To check balance, we simply print
the total balance of the user.(10 marks)*/
import java.util.Scanner;

public class ATMProgram {
    private static double balance = 1000.0; // Initial balanc
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option;
        do {
            displayOptions();
            System.out.print("Enter your choice (1-4): ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    withdrawMoney();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }

        } while (option != 4);
    }

    private static void displayOptions() {
        System.out.println("\nATM Options:");
        System.out.println("1. Withdraw Money");
        System.out.println("2. Deposit Money");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    private static void withdrawMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the withdrawal amount: $");
        double withdrawalAmount = scanner.nextDouble();

        if (withdrawalAmount > balance) {
            System.out.println("Insufficient funds. Withdrawal unsuccessful.");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal successful. Remaining balance: $" + balance);
        }
    }

    private static void depositMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the deposit amount: $");
        double depositAmount = scanner.nextDouble();

        balance += depositAmount;
        System.out.println("Deposit successful. Updated balance: $" + balance);
    }

    private static void checkBalance() {
        System.out.println("Your current balance: $" + balance);
    }
}


