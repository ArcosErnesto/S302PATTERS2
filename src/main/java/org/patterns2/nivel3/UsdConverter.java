package org.patterns2.nivel3;

public class UsdConverter implements CurrencyConverter{
    @Override
    public double convert(double price) {
        double convertedPrice = price * 1.15;
        convertedPrice= Math.round(convertedPrice * 100.0) / 100.0;
        return convertedPrice;
    }
}
