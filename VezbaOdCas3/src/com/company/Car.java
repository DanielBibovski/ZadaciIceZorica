package com.company;

public class Car {

    private int speed;
    private double regularPrice;
    private String color;

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public Car() {

    }

    public double getRegularPrice() {
        return regularPrice;
    }

    protected double getSalePrice(double regularPrice){
        return 0;
    }


}
