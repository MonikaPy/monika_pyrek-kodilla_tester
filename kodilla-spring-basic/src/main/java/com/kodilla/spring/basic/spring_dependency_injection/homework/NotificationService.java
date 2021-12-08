package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public void success(String address) {
        System.out.println("Package delivered to: " + address);
    }

    public void fail(String address) {
        System.out.println("Package not delivered to: " + address);
    }
}
