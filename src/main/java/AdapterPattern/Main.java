package AdapterPattern;

public class Main {
    public static void main(String[] args) {

        ExternalGateway gateway = new ExternalGateway();

        BankPayment payment = new PaymentAdapter(gateway);

        payment.pay(1000);
    }
}