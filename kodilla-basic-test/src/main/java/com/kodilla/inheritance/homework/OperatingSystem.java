package com.kodilla.inheritance.homework;
public class OperatingSystem {
    private int date;
    public OperatingSystem (int date) {
        this.date = date;
    }
    public void turnOn() {
        System.out.println("System were turned on");
    }
    public void turnOff() {
        System.out.println("System were turned off");
    }
    public int getDate(){
        return date;
    }
}
