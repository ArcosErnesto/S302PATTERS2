package org.patterns2.nivel2;

public class MainN2 {
    public static void main(String[] args) {
        Payment card = new CreditCard();
        Payment payPal = new PayPal();
        Payment bank = new BankAccount();

        PaymentPortal portal = new PaymentPortal();

        ShoeShop shop = new ShoeShop(portal);

        shop.makePurchase(card);
        shop.makePurchase(payPal);
        shop.makePurchase(bank);
    }
}
