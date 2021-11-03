package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car ford = new Ford(260);
        Car kia = new Kia(240);
        Car opel  = new Opel(180);

        cars.add(ford);
        cars.add(kia);
        cars.add(opel);

        cars.remove(2);
        cars.remove(new Opel(180));

        System.out.println("The size of Car Array list is " + cars.size());
        for (Car car: cars) {
            CarUtils.describeCar(car);
        }
    }
}
