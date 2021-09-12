package com.company;

public class Ford extends Car{
    private int year;
    private int manufacturerDiscount;

    public Ford(int year, int manufacturerDiscount) {
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    protected double getSalePrice(double regularPrice) {
        double newPrice = regularPrice - Double.valueOf(manufacturerDiscount);
        return newPrice;
    }
}
