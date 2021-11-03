package com.kodilla.collections.interfaces.homework;

import java.util.Random;

public class Opel implements Car{
    private int speed;

    public Opel(int speed){
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        Random random = new Random();
        speed+=  random.nextInt(40);;

    }

    @Override
    public void decreaseSpeed() {
        speed-=20;

    }
}
