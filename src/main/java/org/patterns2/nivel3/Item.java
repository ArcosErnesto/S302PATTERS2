package org.patterns2.nivel3;

public class Item {
    private String name;
    private double price;
    CurrencyConverter currencyConverter;

    public Item(String name, double price, CurrencyConverter currencyConverter) {
        this.name = name;
        this.price = price;
        this.currencyConverter = currencyConverter;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public CurrencyConverter getCurrencyConverter() {
        return currencyConverter;
    }

    public void setCurrencyConverter(CurrencyConverter currencyConverter) {
        this.currencyConverter = currencyConverter;
    }

    public void convertPrice(double price){
        double convertedPrice = currencyConverter.convert(price);
        if (currencyConverter instanceof UsdConverter){
            System.out.println("El precio de "+getName()+ " en USD es: "+convertedPrice+"$.");
        } else if (currencyConverter instanceof GbpConverter) {
            System.out.println("El precio de "+getName()+ " en GBP es: "+convertedPrice+"$.");
        } else{
            System.out.println("El servicio no ha sido configurado.");
        }
    }
}
