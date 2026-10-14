package AdapterPattern;

public class PaymentAdapter implements BankPayment{
    private  ExternalGateway gateway;

    public PaymentAdapter(ExternalGateway gateway) {
        this.gateway = gateway;
    }

    public void pay(int amount) {
        gateway.makePayment(amount);
    }
}
