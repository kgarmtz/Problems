package com.kevin;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        SUV suv = new SUV();

        car.topSpeed();
        suv.topSpeed();
        suv.fuelType();
        car.fuelType();
    }
}
