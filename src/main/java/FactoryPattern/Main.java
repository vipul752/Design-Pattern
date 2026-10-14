package FactoryPattern;

public class Main {
    static void main(String[] args) {
         PaymentService service = new PaymentService();
         service.processPayment("CARD", 100.0);
    }
}
