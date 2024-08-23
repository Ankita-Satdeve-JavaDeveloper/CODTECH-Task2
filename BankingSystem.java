import java.util.HashMap;
import java.util.Scanner;

public class BankingSystem {
    private static HashMap<String, Account> accountMap = new HashMap<>();
    // Static HashMap to store account details, with account number as the key.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean active = true;

        while (active) {
            System.out.println("\nWelcome to the Banking System! Select an option:");
            System.out.println("1. Open a new account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Transfer money");
            System.out.println("5. View account balance");
            System.out.println("6. Exit");

            int option = input.nextInt();
            input.nextLine(); // Clear the buffer

            switch (option) {
                case 1:
                    openAccount(input);
                    break;
                case 2:
                    depositMoney(input);
                    break;
                case 3:
                    withdrawMoney(input);
                    break;
                case 4:
                    transferMoney(input);
                    break;
                case 5:
                    viewBalance(input);
                    break;
                case 6:
                    active = false;
                    System.out.println("Thank you for using our Banking System!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
        input.close();
    }

    private static void openAccount(Scanner input) {
        System.out.print("Enter new account number: ");
        String number = input.nextLine();
        System.out.print("Enter account holder name: ");
        String holderName = input.nextLine();

        if (accountMap.containsKey(number)) {
            System.out.println("An account with this number already exists.");
        } else {
            Account newAccount = new Account(number, holderName);
            accountMap.put(number, newAccount);
            System.out.println("Account successfully created.");
        }
    }

    private static void depositMoney(Scanner input) {
        Account account = locateAccount(input);
        if (account != null) {
            System.out.print("Enter deposit amount: ");
            double amount = input.nextDouble();
            account.addFunds(amount);
        }
    }

    private static void withdrawMoney(Scanner input) {
        Account account = locateAccount(input);
        if (account != null) {
            System.out.print("Enter withdrawal amount: ");
            double amount = input.nextDouble();
            account.deductFunds(amount);
        }
    }

    private static void transferMoney(Scanner input) {
        System.out.print("Enter your account number: ");
        String fromAccountNumber = input.nextLine();
        Account fromAccount = accountMap.get(fromAccountNumber);

        if (fromAccount != null) {
            System.out.print("Enter target account number: ");
            String toAccountNumber = input.nextLine();
            Account toAccount = accountMap.get(toAccountNumber);

            if (toAccount != null) {
                System.out.print("Enter amount to transfer: ");
                double amount = input.nextDouble();
                fromAccount.transferFunds(toAccount, amount);
            } else {
                System.out.println("Error: Target account not found.");
            }
        } else {
            System.out.println("Error: Account not found.");
        }
    }

    private static void viewBalance(Scanner input) {
        Account account = locateAccount(input);
        if (account != null) {
            System.out.println("Account balance: " + account.getBalance());
        }
    }

    private static Account locateAccount(Scanner input) {
        System.out.print("Enter account number: ");
        String accountNumber = input.nextLine();
        Account account = accountMap.get(accountNumber);

        if (account == null) {
            System.out.println("Error: Account not found.");
        }

        return account;
    }
}
