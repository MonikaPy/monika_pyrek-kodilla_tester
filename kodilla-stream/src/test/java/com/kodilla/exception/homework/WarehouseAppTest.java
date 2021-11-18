package com.kodilla.exception.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WarehouseAppTest {
    @Test
    public void shouldOrderExist() throws OrderDoesntExistException {
        Warehouse warehouse=new Warehouse();
        warehouse.addOrder(new Order("11"));
        Order result=warehouse.getOrder("11");
        Assertions.assertNotNull(result);
    }
    @Test
    public void shouldOrderNotExist() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        Assertions.assertThrows(OrderDoesntExistException.class,()->warehouse.getOrder("2"));
    }
}
