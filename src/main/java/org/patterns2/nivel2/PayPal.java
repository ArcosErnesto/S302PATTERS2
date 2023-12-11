package org.patterns2.nivel2;

public class PayPal implements Payment {

    @Override
    public void makePayment() {
        System.out.println("Pago realizado con PayPal.");
    }
}
