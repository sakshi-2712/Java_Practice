class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolderName, String accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }

    public void checkBalance() {
        System.out.println("Account Balance: " + balance);
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private double minimumBalance;

    public SavingsAccount(String accountHolderName, String accountNumber, double initialBalance, double minimumBalance) {
        super(accountHolderName, accountNumber, initialBalance);
        this.minimumBalance = minimumBalance;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= minimumBalance) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied. Minimum balance requirement not met.");
        }
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountHolderName, String accountNumber, double initialBalance, double overdraftLimit) {
        super(accountHolderName, accountNumber, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= -overdraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied. Overdraft limit exceeded.");
        }
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}

public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("sakshi", "DSF233", 5000.0, 1000.0);
        CurrentAccount currentAccount = new CurrentAccount("abc", "DDF2334", 2000.0, 500.0);

        System.out.println("--- Savings Account ---");
        savingsAccount.deposit(2000);
        savingsAccount.withdraw(4000);
        savingsAccount.withdraw(6000);
        savingsAccount.checkBalance();

        System.out.println("\n--- Current Account ---");
        currentAccount.deposit(1000);
        currentAccount.withdraw(2500);
        currentAccount.withdraw(3000);
        currentAccount.checkBalance();
    }
}
