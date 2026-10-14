package FactoryPattern;

public class UpiPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " via UPI");
    }
}
