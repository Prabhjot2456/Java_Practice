public class Bank{
    static String bankName = "SBI";

    int accountNumber;
    String holderName;
    int balance;

    Bank(int accountNumber, String holderName, int balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void display() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
    public static void main(String[] args) {
        Bank b1 = new Bank(101, "Prabhjot", 50000);
        Bank b2 = new Bank(102, "Rahul", 30000);
        Bank b3 = new Bank(103, "Aman", 45000);

        b1.display();
        b2.display();
        b3.display();

        Bank.bankName = "HDFC";
        b1.display();
        b2.display();
        b3.display();
    }
}