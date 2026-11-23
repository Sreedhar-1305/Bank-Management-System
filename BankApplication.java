import java.util.*;

class Bank {
    String bankName;
    int userId;
    String userName;
    long accNumber;
    String accType;
    double balance;

    Bank(String bankName, int userId, String userName, long accNumber, String accType, double balance) {
        this.bankName = bankName;
        this.userId = userId;
        this.userName = userName;
        this.accNumber = accNumber;
        this.accType = accType;
        this.balance = balance;
    }

    void displayBankDetails() {
        System.out.println("Bank Name: " + bankName);
    }

    void userDetails() {
        System.out.println("User Id: " + userId);
        System.out.println("User Name: " + userName);
    }

    void accDetails() {
        System.out.println("Account Number: " + accNumber);
        System.out.println("Account Type: " + accType);
        System.out.println("Current Balance: " + balance);
    }

    String createAccountSummary() {
        String accountSummary = "Bank Name: " + bankName + "\nUser Id: " + userId + "\nUser Name: " + userName
                + "\nAccount Number: " + accNumber + "\nAccount Type: " + accType + "\nCurrent Balance: " + balance;
        return accountSummary;
    }

    boolean hasMinimumBalance(double minBalance) {
        if (balance >= minBalance) {
            return true;
        } else {
            return false;
        }
    }
}

class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bankName = sc.nextLine();
        int userId = sc.nextInt();
        sc.nextLine();
        String userName = sc.nextLine();
        long accNumber = sc.nextLong();
        sc.nextLine();
        String accType = sc.nextLine();
        double balance = sc.nextDouble();
        Bank b1 = new Bank(bankName, userId, userName, accNumber, accType, balance);
        b1.displayBankDetails();
        b1.userDetails();
        b1.accDetails();
        String str = b1.createAccountSummary();
        System.out.println(str);
        double minBalance = sc.nextDouble();
        boolean ans = b1.hasMinimumBalance(minBalance);
        if (ans) {
            System.out.println("Minumum balance is maintained.");
        } else {
            System.out.println("Minimum balance is not maintained.");
        }
        sc.close();
    }
}
