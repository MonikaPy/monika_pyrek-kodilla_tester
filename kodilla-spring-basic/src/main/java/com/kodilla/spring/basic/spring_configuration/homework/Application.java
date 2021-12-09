package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class Application {

    @Bean
    public Car createCar() {
        LocalDate date = LocalDate.now();
        if (date.getMonthValue()==1||date.getMonthValue()==2||date.getMonthValue()==12) {
            return new SUV();
        }else if(date.getMonthValue()==3|| date.getMonthValue()==4||date.getMonthValue()==5||date.getMonthValue()==9||date.getMonthValue()==10||date.getMonthValue()==11) {
            return new Sedan();
        }else{
            return new Cabrio();

        }
    }


}
