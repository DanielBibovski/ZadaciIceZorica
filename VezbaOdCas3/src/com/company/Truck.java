package com.company;

public class Truck extends Car{
    private int weight;


    @Override
    protected double getSalePrice(double regulerPrice) {
        double discountedPrice;
        if(weight>2000){
            discountedPrice = regulerPrice - (regulerPrice/100*10) ;
        }else{
            discountedPrice = regulerPrice - (regulerPrice/100*20);
        }
        return discountedPrice;
    }

}
