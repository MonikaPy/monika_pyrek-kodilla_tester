package com.kodilla.stream.homework;

import com.kodilla.stream.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks(){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Get cat food", LocalDate.of(2021,11,16),LocalDate.of(2021,11,17)));
        tasks.add(new Task("Write a report", LocalDate.of(2021,11,13), LocalDate.of(2021,11,17)));
        tasks.add(new Task("Call Annie", LocalDate.of(2021,07,12), LocalDate.of(2021,12,24)));
        return tasks;
    }
}
