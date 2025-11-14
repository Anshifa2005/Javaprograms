
class MinBalExp extends Exception {
    public MinBalExp(String message) {
        super(message);
    }
}
class Account {
    private String accHolder;
    private double balance;

    
    public Account(String accHolder, double initialBalance) {
        this.accHolder = accHolder;
        this.balance = initialBalance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
        System.out.println("Current Balance: " + balance);
    }

    
    public void withdraw(double amount) throws MinBalExp {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }

        if (amount > balance) {
            throw new MinBalExp(" Withdrawal failed! Insufficient balance. Current Balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Remaining Balance: " + balance);
        }
    }

   
    public void displayBalance() {
        System.out.println("Account Holder: " + accHolder);
        System.out.println("Current Balance: " + balance);
    }
}


public class BankAccountDemo {
    public static void main(String[] args) {
        Account acc = new Account("Ravi Kumar", 5000);

        acc.displayBalance();
        acc.deposit(2000);

        try {
            acc.withdraw(3000);  
            acc.withdraw(5000);  
        } catch (MinBalExp e) {
            System.out.println(e.getMessage());
        }

        acc.displayBalance();
    }
}
