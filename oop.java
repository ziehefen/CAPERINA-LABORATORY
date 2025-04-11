    //Parent class bank Account

class BankAccount {
    private String accountHolderName;
    private double balance;

    //constractor
    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    //Enscapulation: Getter and Setter Methods
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }
    //Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) { 
            balance += amount;
            System.out.println("Depocsited Amount:" + amount);
        } else {
            System.out.println("Inavild deposit amount.");
        } 
    }

    //method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw Amount:" + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balace.");
        }
    }

    //Polymorpism: Override Method
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
    
}

//Child class: Savings Account
class SavingsAccount extends BankAccount {
    private double interestRate;

    //Constractor
    public SavingsAccount(String accountHolderName, double initialBalance, double interestRate) {
    super(accountHolderName, initialBalance);
    this.interestRate = interestRate;
    }

    //Methdod to calculate interest
    public void calculateInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);

        System.out.println("Interest earned: " + interest);
    }

    //Overriding displayAccountDetails Method
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Interest Rate:" + interestRate + "%");
    }
}

//child class: Current Account
class CurrentAccount extends BankAccount {
    private double overdrafLimit;

    //Constractor
    public CurrentAccount(String accountHolderName, double initialBalance, double overdrafLimit) {
        super(accountHolderName, initialBalance);
        this.overdrafLimit = overdrafLimit;
    }

    //Overriding withdraw method to allow overdraft
    @Override
    public void withdraw(double amount) {
        if  ( amount > 0 && (getBalance() + overdrafLimit) >= amount) {
            double newBalance = getBalance() - amount;
            if (newBalance < 0) {
                overdrafLimit += newBalance; //Reduce overdraf Limit
            }
        super.deposit(-amount);
        System.out.println("Withdraw Amount: " + amount);

        } else {
            System.out.println("Invalid withdrawal amount or overdraf limit exceeded.");
        }
    }

    //Overriding displayAccountDetails Method
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Over draf limit." + overdrafLimit);
    }

    //Main class to test the banking system

    public class oop {
        public static void main(String[] args) {
            
            //Creating a savings account
            SavingsAccount savings = new SavingsAccount("Mark", 5000,3);
            savings.displayAccountDetails();
            savings.deposit(500);
            savings.calculateInterest();
            savings.withdraw(500);
            System.out.println();

            //Creating a current Account
            CurrentAccount current = new CurrentAccount ( "John", 3000, 2000);
            current.displayAccountDetails();
            current.withdraw(1500);
            current.withdraw(500);

            current.displayAccountDetails();
        }
    }

}