package Day4Exercise;

public class Paymentdemo {
	
	    public static void main(String[] args) {
	        // Creating CashPayment objects
	        Cashpayment cashpayment1 = new Cashpayment(150.00);
	        Cashpayment cashpayment2 = new Cashpayment(75.50);

	        // Creating CreditCardPayment objects
	        CreditCardPayment creditCardPayment1 = new CreditCardPayment(200.00, "John Doe", "12/25", "1234567890123456");
	        CreditCardPayment creditCardPayment2 = new CreditCardPayment(350.75, "Jane Smith", "08/23", "6543210987654321");

	        // Displaying payment details
	        System.out.println("Cash Payments:");
	        cashpayment1.paymentDetails();
	        cashpayment2.paymentDetails();

	        System.out.println("\nCredit Card Payments:");
	        creditCardPayment1.paymentDetails();
	        creditCardPayment2.paymentDetails();
	    }
	

}
