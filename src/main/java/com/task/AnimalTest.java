package com.task;



import org.testng.annotations.Test;

class Animal {
    String type = "Dont Know";

    public String getType() {
        return type;
    }
}

class Lion extends Animal {
    public Lion() {
        type = "Lion";
    }
}

public class AnimalTest {
    @Test
    public void testAnimalType() {
        Lion l = new Lion();
        System.out.println("Animal Name: " + l.getType());
    }
}
