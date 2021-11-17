package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgAfterForty = UsersRepository.getUsersList()
                .stream()
                .filter(n->n.getAge()>=40 )
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println("Srednia liczba postów dla użytkowników, których wiek jest powyżej lub równy 40 to: " + avgAfterForty);

        double avgBeforeForty = UsersRepository.getUsersList()
                .stream()
                .filter(n->n.getAge()<40 )
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println("Srednia liczba postów dla użytkowników, których wiek jest poniżej 40 to: " + avgBeforeForty);
    }
}
