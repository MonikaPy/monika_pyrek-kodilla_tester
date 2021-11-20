package com.kodilla.mockito.homework;

import com.kodilla.mockito.Client;
import com.kodilla.mockito.NotificationService;

import javax.management.Notification;

public class WeatherAppTestSuite {
    WeatherApp weatherApp = new WeatherApp();
    Person person = Mockito.mock(Person.class);
    Notification notification = Mockito.mock(Notification.class);
}
