package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    double bokA;
    double bokB;
    public Rectangle (double a, double b){
        bokA=a;
        bokB=b;
    }
public double obliczPole(){
        return bokA*bokB;
}
}

