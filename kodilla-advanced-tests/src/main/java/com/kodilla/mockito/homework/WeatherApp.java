package com.kodilla.mockito.homework;

import com.kodilla.mockito.Client;
import com.sun.nio.sctp.Notification;

import java.util.HashMap;
import java.util.Map;


public class WeatherAppTestSuite {
    private Map<Person> persons = new HashMap<>();
    public void addSubscriber(Person person) {
        this.persons.add(person);
    }

    public void sendNotification(Notification notification) {
        this.persons.forEach(person -> person.receive(notification));
    }
    public void removeSubscriber(Client client) {
        this.persons.remove(person);
    }
}
