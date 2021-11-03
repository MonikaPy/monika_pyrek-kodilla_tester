package com.kodilla.collections.interfaces.homework;

import java.util.Random;

public class Kia implements Car{
    private int speed;

    public Kia(int speed){
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        Random random = new Random();
        speed+=  random.nextInt(10);;
        return speed;
    }

    @Override
    public void decreaseSpeed() {
        speed-=30;

    }
}
