package practice;

class Account {
    private String number;
    private String holderName;
    private double balance;

    public Account(String number, String holderName) {
        this.number = number;
        this.holderName = holderName;
        this.balance = 0.0;
        // Initializes a new account with the given number and holder name, with an initial balance of 0.0.
    }

    public String getNumber() {
        return number;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void addFunds(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully added " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }

    public void deductFunds(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Error: Invalid withdrawal amount or insufficient balance.");
        }
    }

    public void transferFunds(Account targetAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            deductFunds(amount);
            targetAccount.addFunds(amount);
            System.out.println("Transferred " + amount + " to " + targetAccount.getHolderName() + ". Remaining balance: " + balance);
        } else {
            System.out.println("Error: Invalid transfer amount or insufficient balance.");
        }
    }
}
