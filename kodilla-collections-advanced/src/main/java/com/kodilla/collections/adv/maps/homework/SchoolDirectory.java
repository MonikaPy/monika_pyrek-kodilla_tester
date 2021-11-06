package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolPricipal = new HashMap<>();

        Principal Anna = new Principal("Anna Kowalska");
        Principal Jan = new Principal("Jan Nowak");
        Principal Izabella = new Principal("Izabella Skowron");
        Principal Tomasz = new Principal("Tomasz Rataj");

        School podstawowka = new School("Szkoła podstawowa nr 5", 1, 2, 4, 8, 9, 14);
        School gimnazjum = new School("Gimnazjum", 14, 7, 22, 5, 8, 11, 19);
        School liceum = new School("Liceum nr 3", 3, 17, 25);
        School technikum = new School("Technikum nr 15", 10, 16, 4, 8, 27);

        schoolPricipal.put(Anna, podstawowka);
        schoolPricipal.put(Jan, gimnazjum);
        schoolPricipal.put(Izabella, liceum);
        schoolPricipal.put(Tomasz, technikum);

        for (Map.Entry<Principal, School> principalSchoolEntry : schoolPricipal.entrySet())
            System.out.println(principalSchoolEntry.getKey().getFirstname() + ", jest dyrektorem  " +
                    principalSchoolEntry.getValue().getName() +", szkoła ta ma " + principalSchoolEntry.getValue().getSum()+" uczniów" );
    }


}
