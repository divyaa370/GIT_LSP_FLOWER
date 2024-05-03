package org.howard.edu.lsp.oopfinal.question3;

public class Client {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape c = shapeFactory.getShape("CIRCLE");
        c.draw();

        Shape r = shapeFactory.getShape("RECTANGLE");
        r.draw();
    }
}