package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Opel;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car type: " + getCarType(car));
        System.out.println("Speed: " + car.getSpeed());
        System.out.println("Increase speed: " + car.increaseSpeed());
    }

    private static String getCarType(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Kia)
            return "Kia";
        else
            return "Unknown Car";
    }
}
