package org.patterns2.nivel2;

public class BankAccount implements Payment{

    @Override
    public void makePayment(Double amount) {
        System.out.println("Pago realizado con cuenta bancária "+amount+".");
    }
}
