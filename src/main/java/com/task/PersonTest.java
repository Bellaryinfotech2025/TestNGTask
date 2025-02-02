package com.task;



import org.testng.annotations.Test;

class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDetails() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class PersonTest {
    @Test
    public void testPersonDetails() {
        Person p = new Person();
        p.setName("John");
        p.setAge(25);
        System.out.println(p.getDetails());
    }
}
