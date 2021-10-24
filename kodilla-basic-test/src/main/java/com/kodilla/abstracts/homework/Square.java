package com.kodilla.abstracts.homework;

public class Square extends Shape {
    public Square (double a){
        super.bokA=a;

    }
    double obliczPole(){
        return super.bokA*super.bokA;
    }
}
