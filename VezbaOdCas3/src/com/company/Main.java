package com.company;

public class Main {

    public static void main(String[] args) {

        Sedan sedan = new Sedan(5);
        Ford ford1 = new Ford(1976, 300);
        Ford ford2 = new Ford(2019, 100);
        Car car = new Car(260, 7000, "Red");

        System.out.println("The sale price of Sedan is: " + sedan.getSalePrice(car.getRegularPrice()));
        System.out.println("The sale price of Ford1 is: " + ford1.getSalePrice(car.getRegularPrice()));
        System.out.println("The sale price of Ford2 is: " + ford2.getSalePrice(car.getRegularPrice()));
        System.out.println("The regular sale price of a car is: " + car.getRegularPrice());
    }

}
