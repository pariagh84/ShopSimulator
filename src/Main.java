import payment.*;

public class Main {
    public static void main(String[] args) {

        //Creating 3 customers
        Customer customer1 = new PremiumCustomer("Helia");
        Customer customer2 = new PremiumCustomer("Rozhin");
        Customer customer3 = new RegularCustomer("Anisa");


        //Creating objects from payment methods
        BitcoinPayment bitcoinPayment = new BitcoinPayment("1A3gG7X9pVbK2mQ5YzNd6FJ8LC4TWoXHPq\n");
        CreditCardPayment creditCardPayment = new CreditCardPayment("4539 1488 0343 6467", "Helia");
        PayPalPayment payPalPayment = new PayPalPayment("rozhin.jbk85@gmail.com");


        //Displaying customers info
        customer1.displayCustomerInfo();
        customer2.displayCustomerInfo();
        customer3.displayCustomerInfo();


        //Making 2 payments for all the customers
        customer1.makePayment(creditCardPayment, 139.99);
        customer2.makePayment(payPalPayment, 357.31);
        customer3.makePayment(bitcoinPayment, 28674.95);


        //Displaying payment history of each customer
        customer1.showPaymentHistory();
        customer2.showPaymentHistory();
        customer3.showPaymentHistory();

    }
}