package com.jogi.factory;

import com.jogi.factory.pattern.Circle;
import com.jogi.factory.pattern.Rectangle;
import com.jogi.factory.pattern.Shape;
import com.jogi.factory.pattern.Square;

public class ShapeFactory {

    public Shape getShape(String shape){
        switch (shape){
            case "CIRCLE":
                return new Circle();

            case "SQUARE":
                return new Square();

            case "RECTANGLE":
                return new Rectangle();
            default:
                return null;

        }
    }
}
