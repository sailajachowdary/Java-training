package Day4Exercise;

class CreditCardPayment extends Payment {
    private String nameOnCard;
    private String expirationDate;
    private String creditCardNumber;

    public CreditCardPayment(double amount, String nameOnCard, String expirationDate, String creditCardNumber) {
        super(amount);
        this.nameOnCard = nameOnCard;
        this.expirationDate = expirationDate;
        this.creditCardNumber = creditCardNumber;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void paymentDetails() {
        System.out.println("The payment amount of $" + getAmount() + " is made using a credit card.");
        System.out.println("Cardholder Name: " + nameOnCard);
        System.out.println("Expiration Date: " + expirationDate);
        System.out.println("Credit Card Number: " + creditCardNumber);
    }
}
