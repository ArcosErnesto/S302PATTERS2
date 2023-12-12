package org.patterns2.nivel2;

public class PayPal implements Payment {

    @Override
    public void makePayment(Double amount) {
        System.out.println("Pago realizado con PayPal de importe "+amount+".");
    }
}
