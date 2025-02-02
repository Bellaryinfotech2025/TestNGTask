package com.task;



import org.testng.annotations.Test;

class Person {
    private String name;
    private int age;
    private String Profession;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setProfession(String Profession){
        this.Profession=Profession;
    }

    public String getDetails() {
        return "Name: " + name + ", Age: " + age + " , Profession: "+ Profession;
    }
}

public class PersonTest {
    @Test
    public void testPersonDetails() {
        Person p = new Person();
        p.setName("Gouse Pathan");
        p.setAge(30);
        p.setProfession("Java Developer");
        System.out.println(p.getDetails());
    }
}
