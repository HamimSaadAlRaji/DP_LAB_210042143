public class PaymentProcess {
    public void ProcessPayment(float amount,Ipayment payment){
        payment.pay(amount);
    }
}
