package com.company;

public class Sedan extends Car{

    private int length;

    public Sedan(int length) {
        this.length = length;
    }

    @Override
    public double getSalePrice(double regulerPrice) {
        double discountedPrice;
        if(length > 20){
            discountedPrice = regulerPrice - (regulerPrice/100*5) ;
        }else{
            discountedPrice = regulerPrice - (regulerPrice/100*10);
        }
        return discountedPrice;
    }
}
