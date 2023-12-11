package org.patterns2.nivel2;

public class CreditCard implements Payment {

    @Override
    public void makePayment() {
        System.out.println("Pago realizado con targeta.");
    }
}
