package org.patterns2.nivel2;

public class PaymentPortal {
    public void processPayment(Payment payment, Double amount){
        payment.makePayment(amount);
    }
}
