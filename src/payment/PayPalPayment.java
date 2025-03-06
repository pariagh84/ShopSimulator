package payment;

public class PayPalPayment implements PaymentStrategy {

    String email;

    public PayPalPayment(String email) {

        this.email = email;
    }

    @Override
    public void pay(double amount) {

        System.out.println("\nThank you! Your payment of " + amount + " has been successfully processed.\nPayment details : " + getPaymentDetails());
    }

    @Override
    public String getPaymentDetails() {

        return "PayPal Payment Service.\nEmail : " + this.email;
    }

}
