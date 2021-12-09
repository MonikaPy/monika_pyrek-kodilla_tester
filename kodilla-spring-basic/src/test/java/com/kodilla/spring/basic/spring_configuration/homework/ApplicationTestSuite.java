package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;


@SpringBootTest
public class ApplicationTestSuite {

    @Test
public void TestLights(){
        ApplicationContext context= new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car= (Car) context.getBean("createCar");
        LocalTime time = LocalTime.now();
        if (time.isAfter(LocalTime.of(20, 0)) || time.isBefore(LocalTime.of(6, 0))){
            Assertions.assertTrue(car.hasHeadlightsTurnedOn());
        } else Assertions.assertFalse(car.hasHeadlightsTurnedOn());
    }
    @Test
    public void createCar(){
        ApplicationContext context= new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car= (Car) context.getBean("createCar");
        Assertions.assertTrue(car instanceof Sedan || car instanceof SUV || car instanceof Cabrio);
    }

}