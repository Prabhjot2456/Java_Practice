class BankAccount{
    int accountNumber;
    String accountHolder;
    int balance;

    BankAccount() {
        balance = 1000;
    }

    BankAccount(int accountNumber, String accountHolder, int balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}

public class Que7{
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount();
        BankAccount a2 = new BankAccount(1234, "Prabh", 0);
        a1.display();
        a2.display();
    }
}