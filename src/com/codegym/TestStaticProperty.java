package com.codegym;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car c1 = new Car("Mec", "Skyactiv 3");
        System.out.println(Car.numberofCar);
        Car c2 = new Car("BMW", "Skyactiv 6");
        System.out.println(Car.numberofCar);
    }
}

