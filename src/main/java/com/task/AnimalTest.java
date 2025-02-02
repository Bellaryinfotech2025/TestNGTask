package com.task;



import org.testng.annotations.Test;

class Animal {
    String type = "Unknown Animal";

    public String getType() {
        return type;
    }
}

class Dog extends Animal {
    public Dog() {
        type = "Dog";
    }
}

public class AnimalTest {
    @Test
    public void testAnimalType() {
        Dog d = new Dog();
        System.out.println("Animal Type: " + d.getType());
    }
}
