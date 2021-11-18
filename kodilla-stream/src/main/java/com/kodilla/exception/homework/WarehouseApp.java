package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
Warehouse warehouse= new Warehouse();
warehouse.addOrder(new Order ("478"));
        warehouse.addOrder(new Order ("423"));
        warehouse.addOrder(new Order ("356"));
        warehouse.addOrder(new Order ("11"));

        try {
            warehouse.getOrder("2");
        } catch (OrderDoesntExistException e) {
            System.out.println("Zamówienie nie istnieje.");
        }
    }
}
