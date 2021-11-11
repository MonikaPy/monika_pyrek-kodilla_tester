package com.kodilla.collections.adv.exercises.homework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FlightFinderTestSuit {
    @Test
    public void testFindFlightsFrom(){
        FlightFinder flightFinder= new FlightFinder();
        List<Flight> flights = flightFinder.findFlightsFrom("Praga");
        Assertions.assertEquals(1,flights.size());
    }
    @Test
    public void testfindFlightsTo(){
        FlightFinder flightFinder= new FlightFinder();
        List<Flight> flights = flightFinder.findFlightsTo("Praga");
        Assertions.assertEquals(0,flights.size());
    }
}
