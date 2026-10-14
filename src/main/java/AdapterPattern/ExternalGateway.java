package AdapterPattern;

class ExternalGateway {
    public void makePayment(int amount) {
        System.out.println("Paid Rs. " + amount);
    }
}