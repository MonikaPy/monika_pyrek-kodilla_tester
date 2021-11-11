package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Integer> school = new ArrayList<>();


    public School(String name, int... school) {
        this.name = name;
        for (int student : school)
            this.school.add(student);
    }

    public int getSum() {
        int sum = 0;
        for (int student : school)
            sum += student;
        return sum;
    }

    @Override
    public String toString() {
        return "Liczba uczniów w szkole "+ name + " wynosi: "+ getSum();
    }
}
