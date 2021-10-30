package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Car ford = new Ford(200);
        System.out.println("Ford speed is");
        doRace(ford);
        Car opel = new Opel(120);
        System.out.println("Audi speed is");
        doRace(opel);
        Car kia = new Kia(50);
        System.out.println("Kia speed is");
        doRace(kia);
    }

    public static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}

