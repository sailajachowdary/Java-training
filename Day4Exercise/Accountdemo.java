package Day4Exercise;

public class Accountdemo {
    public static void main(String[] args) {
        // Testing Account class
    	
        Account account = new Account(1000);
        
        System.out.println("Account balance: $" + account.getBalance());
        
        account.deposit(500);
        System.out.println("Account balance after deposit: $" + account.getBalance());
        
        account.withdraw(200);
        System.out.println("Account balance after withdrawal: $" + account.getBalance());

        // Testing SavingsAccount class
        
        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
        
        System.out.println("SavingsAccount balance: $" + savingsAccount.getBalance());
        System.out.println("SavingsAccount interest rate: " + savingsAccount.getInterestRate());
        
        savingsAccount.deposit(500);
        System.out.println("SavingsAccount balance after deposit: $" + savingsAccount.getBalance());
        
        savingsAccount.withdraw(200);
        System.out.println("SavingsAccount balance after withdrawal: $" + savingsAccount.getBalance());

        // Testing CheckingAccount class
        CheckingAccount1 checkingAccount1 = new CheckingAccount1(1000, 500);
        
        System.out.println("CheckingAccount1 balance: $" + checkingAccount1.getBalance());
        checkingAccount1.deposit(500);
        
        System.out.println("CheckingAccount1 balance after deposit: $" + checkingAccount1.getBalance());
        
        checkingAccount1.withdraw(2000); // This will succeed due to overdraft
        System.out.println("CheckingAccount1 balance after withdrawal: $" + checkingAccount1.getBalance());

        CheckingAccount1 checkingAccount2 = new CheckingAccount1(1000);
        
        System.out.println("CheckingAccount2 balance: $" + checkingAccount2.getBalance());
        checkingAccount2.deposit(500);
        
        System.out.println("CheckingAccount2 balance after deposit: $" + checkingAccount2.getBalance());
        
        checkingAccount2.withdraw(2000); // This will fail due to no overdraft
        System.out.println("CheckingAccount2 balance after attempted withdrawal: $" + checkingAccount2.getBalance());
    }
}