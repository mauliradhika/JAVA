class BankAccount {
    String accountNumber;
    double balance;
    static String bankName = "Global Bank";
    static double interestRate = 3.5;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    static void setInterestRate(double newRate) {
        interestRate = newRate;
    }

    static double getInterestRate() {
        return interestRate;
    }

    void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class StaticMembers {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("123456", 1000.0);
        BankAccount acc2 = new BankAccount("789012", 2500.0);

        acc1.displayAccountInfo();
        acc2.displayAccountInfo();

        BankAccount.setInterestRate(4.0);

        System.out.println("Updated Interest Rate: " + BankAccount.getInterestRate() + "%");

        acc1.displayAccountInfo();
        acc2.displayAccountInfo();
    }
}

