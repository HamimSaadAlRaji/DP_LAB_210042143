public class CreditCardPayment implements Ipayment{
    @Override
    public void pay(float amount){
        System.out.println("Paid using" + amount +"Credit Card");
    }
}
