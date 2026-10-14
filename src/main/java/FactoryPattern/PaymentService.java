package FactoryPattern;

public class PaymentService {
    public void processPayment(String method,double amount){
        Payment payment = PaymentFactory.createPayment(method);
        payment.pay(amount);
    }
}
