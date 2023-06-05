package com.jogi.factory;

import com.jogi.factory.pattern.Shape;

public class Main {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape=factory.getShape("SQUARE");
        shape.draw();
    }
}
