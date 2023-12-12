package org.patterns2.nivel3;

public class MainN3 {
    public static void main(String[] args){
        CurrencyConverter usd = new UsdConverter();
        CurrencyConverter gbp = new GbpConverter();

        Item item1 = new Item("Item1", 50.75, usd);
        Item item2 = new Item("Item2", 60.15, gbp);

        item1.convertPrice(item1.getPrice());
        item2.convertPrice(item2.getPrice());
    }

}
