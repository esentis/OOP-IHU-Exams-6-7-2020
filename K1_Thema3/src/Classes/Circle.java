/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 * @author esentis
 */
public class Circle implements Shape {

    private double radius;
    private final double pi = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        // I know pi*pi is ugly. It does it's job though.
        return radius * (pi * pi);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws WrongDimensionsException{
        if (radius < 10 || radius > 50) {
            throw new WrongDimensionsException("Wrong Dimensions");
        }
        this.radius = radius;
    }

    public double getPi() {
        return pi;
    }

    @Override
    public String toString() {
        return "A beautiful Circle with radius " + radius + " and area " + area();
    }

}
