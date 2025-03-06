package payment;

public class CreditCardPayment implements PaymentStrategy {

    String cardNumber;
    String cardHolderName;

    public  CreditCardPayment(String cardNumber, String cardHolderName) {

        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("\nThank you! Your payment of " + amount + " has been successfully processed.\nPayment details :  " + getPaymentDetails());
    }

    @Override
    public String getPaymentDetails() {

        return "CreditCard Payment Service.\nCard Number : " + this.cardNumber + "\nCard Holder : " + this.cardHolderName;
    }
}
