package org.patterns2.nivel2;

public class CreditCard implements Payment {

    @Override
    public void makePayment(Double amount) {
        System.out.println("Pago realizado con targeta de importe "+amount+".");
    }
}
