public abstract class Payment{
    protected String methodName;

    public Payment(String methodName) {
        this.methodName = methodName;
    }

    public abstract void processPayment(double amount);
}

class CreditCardPayment extends Payment {
    public CreditCardPayment() {
        super("Credit Card");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

 class PayPalPayment extends Payment {
    public PayPalPayment() {
        super("PayPal");
    }

    @Override
    public void processPayment(double amount) {

        System.out.println("Processing PayPal payment of $" + amount);
    }
}
