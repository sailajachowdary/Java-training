package Day4Exercise;

public class Payment {
	
	    private double amount;

	    public Payment(double amount) {
	        this.amount = amount;
	    }

	    public double getAmount() {
	        return amount;
	    }

	    public void setAmount(double amount) {
	        this.amount = amount;
	    }

	    public void paymentDetails() {
	        System.out.println("The payment amount is $" + amount);
	    }
	

}
