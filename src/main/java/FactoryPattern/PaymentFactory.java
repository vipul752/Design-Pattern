package FactoryPattern;

class PaymentFactory {

    public static Payment createPayment(String method) {
        if (method == null) {
            throw new IllegalArgumentException(
                    "Payment method cannot be null"
            );
        }

        switch (method.toUpperCase()) {
            case "UPI":
                return new UpiPayment();

            case "CARD":
                return new CreditCardPayment();

            default:
                throw new IllegalArgumentException(
                        "Unsupported payment method: " + method
                );
        }
    }
}