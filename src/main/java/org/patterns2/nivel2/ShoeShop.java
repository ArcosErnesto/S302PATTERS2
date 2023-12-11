package org.patterns2.nivel2;

public class ShoeShop {
    private PaymentPortal paymentPortal;

    public ShoeShop(PaymentPortal paymentPortal) {
        this.paymentPortal = paymentPortal;
    }

    public void makePurchase(Payment payment){
        paymentPortal.processPayment(payment);
    }
}
