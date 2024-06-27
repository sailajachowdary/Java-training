package Day4Exercise;

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(double initBalance, double interestRate) {
        super(initBalance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
}

class CheckingAccount1 extends Account {
    private double overdraftAmount;

    public CheckingAccount1(double initBalance, double overdraft) {
        super(initBalance);
        this.overdraftAmount = overdraft;
    }

    public CheckingAccount1(double initBalance) {
        this(initBalance, 0.0);
    }

    @Override
    public boolean withdraw(double amt) {
        if (amt > 0 && amt <= (balance + overdraftAmount)) {
            balance -= amt;
            return true;
        }
        return false;
    }
}



