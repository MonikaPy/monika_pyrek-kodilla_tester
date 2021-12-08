package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {


    @Test
    public void ShouldAddValue() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double calculate = bean.add(5, 6);
        Assertions.assertEquals(11,calculate);
    }

    @Test
    public void ShouldSubtractValues() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double calculate = bean.subtract(8, 3);
        Assertions.assertEquals(5,calculate);
    }

    @Test
    public void ShouldMultiplyValues() {ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double calculate = bean.multiply(5, 4);
        Assertions.assertEquals(20,calculate);
    }

    @Test
    public void ShouldDivideValue() {ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double calculate = bean.divide(21, 7);
        Assertions.assertEquals(3,calculate);
    }
}
