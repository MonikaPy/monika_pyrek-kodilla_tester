package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable(){
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Kraków", "Londyn"));
        flights.add(new Flight("Praga", "Rzym"));
        flights.add(new Flight("Paryż", "Nowy Jork"));
        flights.add(new Flight("Moskwa", "Berlin"));
        flights.add(new Flight("Wrocław", "Kopenhaga"));
        return flights;
    }


}
