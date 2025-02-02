package com.task;

import org.testng.annotations.Test;

class Shape {
    public String draw() {
        return "Drawing a shape";
    }
}

class Circle extends Shape {
    @Override
    public String draw() {
        return "Drawing a circle";
    }
}

public class ShapeTest {
    @Test
    public void testShapeDrawing() {
        Shape s = new Circle();
        System.out.println(s.draw()); // Expected: "Drawing a circle"
    }
}
