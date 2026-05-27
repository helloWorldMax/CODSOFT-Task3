import java.util.Scanner;

class BankAccount {

    double balance;

    BankAccount(double initialValue) {
        balance = initialValue;
    }

    void deposit(double depositAmount) {

        if(depositAmount > 0) {

            balance += depositAmount;
            System.out.println("Deposit done.");
        }

        else {

            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double withdrawAmount) {

        if(withdrawAmount > balance) {

            System.out.println("Insufficient Balance!");
        }

        else if(withdrawAmount <= 0) {

            System.out.println("Invalid withdrawal amount.");
        }

        else {

            balance -= withdrawAmount;
            System.out.println("Withdrawal done.");
        }
    }

    void displayBalance() {

        System.out.printf("Balance: $%.2f\n", balance);
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(double initialValue) {

        super(initialValue);
    }
}

class CheckingAccount extends BankAccount {

    CheckingAccount(double initialValue) {

        super(initialValue);
    }
}

public class Codsoft3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double initialBalance;
        double depositAmount;
        double withdrawAmount;

        int accountType;

        System.out.print("Enter Initial Balance: ");
        initialBalance = sc.nextDouble();

        // Account Selection
        System.out.println("\nSelect Account Type");
        System.out.println("1. Savings Account");
        System.out.println("2. Checking Account");

        System.out.print("Enter Choice: ");
        accountType = sc.nextInt();

        if(accountType == 1) {

            System.out.println("\nSavings Account");

            SavingsAccount savingsAccount =
                    new SavingsAccount(initialBalance);

            System.out.print("Enter Deposit Amount: ");
            depositAmount = sc.nextDouble();

            savingsAccount.deposit(depositAmount);

            savingsAccount.displayBalance();

            System.out.print("Enter Withdraw Amount: ");
            withdrawAmount = sc.nextDouble();

            savingsAccount.withdraw(withdrawAmount);

            savingsAccount.displayBalance();
        }

        else if(accountType == 2) {

            System.out.println("\nChecking Account");

            CheckingAccount checkingAccount =
                    new CheckingAccount(initialBalance);

            System.out.print("Enter Deposit Amount: ");
            depositAmount = sc.nextDouble();

            checkingAccount.deposit(depositAmount);

            checkingAccount.displayBalance();

            System.out.print("Enter Withdraw Amount: ");
            withdrawAmount = sc.nextDouble();

            checkingAccount.withdraw(withdrawAmount);

            checkingAccount.displayBalance();
        }

        else {

            System.out.println("Invalid Account Type.");
        }

        sc.close();
    }
}