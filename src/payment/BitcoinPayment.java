package payment;

public class BitcoinPayment implements PaymentStrategy {

    String walletAddress;

    public BitcoinPayment(String walletAddress) {

        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("\nThank you! Your payment of " + amount + " has been successfully processed.\nPayment details :  " + getPaymentDetails());
    }

    @Override
    public String getPaymentDetails() {

        return "Bitcoin Payment Service.\nWallet Address : " + this.walletAddress;
    }
}
