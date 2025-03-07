package payment;

public class RegularCustomer extends Customer {

    public RegularCustomer(String name) {

        super(name);

    }

    @Override
    public void displayCustomerInfo() {

        System.out.println("Name: " + name);
        System.out.println("Customer status: Regular customer");
        System.out.println();

    }
}
