package com.kodilla.abstracts.homework;

public class Square extends Shape {
    double bokA;
    public Square (double a){
        bokA=a;

    }
    public double obliczPole(){
        return bokA*bokA;
    }
}
