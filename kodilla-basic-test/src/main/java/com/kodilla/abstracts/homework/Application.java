package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square a = new Square(2.0);
        Rectangle b = new Rectangle(2.0, 4.0);

        System.out.println("Pole kwadratu = " + a.obliczPole());
        System.out.println("Pole prostokata = " + b.obliczPole());
    }
}

