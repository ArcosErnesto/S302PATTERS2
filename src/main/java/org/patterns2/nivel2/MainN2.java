package org.patterns2.nivel2;

public class MainN2 {
    public static void main(String[] args) {
        Payment card = new CreditCard();
        Payment payPal = new PayPal();
        Payment bank = new BankAccount();

        PaymentPortal portal = new PaymentPortal();

        ShoeShop shop = new ShoeShop(portal);

        Double amount1 = 15.95;
        Double amount2 = 70.35;
        Double amount3 = 26.0;

        shop.makePurchase(card, amount1);
        shop.makePurchase(payPal, amount2);
        shop.makePurchase(bank, amount3);
    }
}
