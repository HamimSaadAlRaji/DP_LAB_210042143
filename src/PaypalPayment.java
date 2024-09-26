public class PaypalPayment implements Ipayment{
    @Override
    public void pay(float amount){
        System.out.println("Paid using" + amount +"Paypal");
    }
}


