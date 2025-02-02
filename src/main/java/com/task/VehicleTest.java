package com.task;



import org.testng.annotations.Test;

abstract class Vehicle {
    abstract String getType();
}

class Car extends Vehicle {
    @Override
    public String getType() {
        return "Car";
    }
}

public class VehicleTest {
    @Test
    public void testVehicleType() {
        Vehicle v = new Car();
        System.out.println("Vehicle Type: " + v.getType()); // Expected: "Vehicle Type: Car"
    }
}
