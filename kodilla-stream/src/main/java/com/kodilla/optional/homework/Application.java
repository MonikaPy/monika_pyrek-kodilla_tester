package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Student> students= new ArrayList<>();
        students.add(new Student("Jan Kowalski", new Teacher("Bożena Nowak")));
        students.add(new Student("Anna Sokół", new Teacher("Tomasz Barański")));
        students.add(new Student("Wojciech Kaleta", null));
        students.add(new Student("Kinga Skowron", new Teacher("Joanna Waza")));



        for (Student student : students) {
            System.out.println("Uczeń: " + student.getName()+ ", Nauczyciel: "+ student.getTeacher());

        }
    }
}
