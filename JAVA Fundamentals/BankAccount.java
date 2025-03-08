public class BankAccount {
    protected String accountHolder;
    protected double balance;
    protected int accountNumber; 

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdrawal(double amount) {
        if (amount <= balance) { 
            balance = balance-amount;
            System.out.println("Current balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }

    public void deposit(double amount) {
            balance=balance+amount;
            System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount BA = new BankAccount("Maha", 24248, 10000);
        BA.withdrawal(1000);
        BA.deposit(1500);
    }
}