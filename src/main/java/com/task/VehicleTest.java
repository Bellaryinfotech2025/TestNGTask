package com.task;



import org.testng.annotations.Test;

abstract class Vehicle {
    abstract String getName();
}

class Car extends Vehicle {
    @Override
    public String getName() {
        return "BMW";
    }
}

public class VehicleTest {
    @Test
    public void testVehicleType() {
        Vehicle v = new Car();
        System.out.println("Vehicle Name: " + v.getName());
    }
}
