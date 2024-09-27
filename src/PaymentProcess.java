public class PaymentProcess {
    public double ProcessPayment(double amount,Ipayment payment){
        return payment.pay(amount);
    }
}
