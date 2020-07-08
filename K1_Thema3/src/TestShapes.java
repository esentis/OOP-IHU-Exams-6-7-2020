
import Classes.Circle;
import Classes.Rectangle;
import Classes.Shape;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author esentis
 */
public class TestShapes {

    public static double averageRectangleArea(Shape[] shapes) {
        double average = 0;
        double sum = 0;
        int rectangles = 0;
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                sum = sum + shape.area();
                rectangles++;
            }
        }
        // Obviously we dont test if there are no rectangles ^^ (zero division)
        average = sum / rectangles;
        return average;
    }

    // You would expect "maxCircleArea" would return maxArea, though it returns maxRadius.. f logic.
    public static double maxCircleArea(Shape[] shapes) {
        double maxRadius = 0;
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                if (((Circle) shape).getRadius() > maxRadius) {
                    maxRadius = ((Circle) shape).getRadius();
                }
            }
        }
        return maxRadius;
    }

    public static double totalShapeArea(Shape[] shapes) {
        double totalShapesArea = 0;
        for (Shape shape : shapes) {
            totalShapesArea += shape.area();
        }
        return totalShapesArea;
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[50];
        // Scanner will handle the user input
        Scanner sc = new Scanner(System.in);
        // An ugly loop to get the 50 shapes of...grey :D
        for (int i = 0; i < 50; i++) {
            // Something beautiful to simulate 50/50 randomness.
            // randomNumber is either 0 : Circle or 1: Rectangle
            int randomNumber = (int) Math.floor((Math.random() * 2));
            System.out.println(randomNumber);
            // So if the shape is circle
            if (randomNumber == 0) {
                System.out.print("Seems that you are adding a circle, give the radius\n");
                // And we ask the user for the radius
                double radius = Double.parseDouble(sc.nextLine());
                while (radius < 10 || radius > 50) {
                    System.out.print("Obey the rules, radius should be between 10 and 50\n");
                    // And we ask the user for the radius
                    radius = Double.parseDouble(sc.nextLine());
                }
                Circle circle = new Circle(radius);
                shapes[i] = circle;
            } // Else it's rectangle
            else {
                System.out.print("Seems that you are adding a rectangle, give the base\n");
                // And we ask the user for the base of the rectangle
                double base = Double.parseDouble(sc.nextLine());
                while (base < 10 || base > 50) {
                    System.out.print("Obey the rules, base should be between 10 and 50\n");
                    // And we ask the user for the radius
                    base = Double.parseDouble(sc.nextLine());
                }
                System.out.print("And lastly give the height");
                double height = Double.parseDouble(sc.nextLine());
                while (height < 10 || height > 50) {
                    System.out.print("Obey the rules, height should be between 10 and 50\n");
                    // And we ask the user for the radius
                    height = Double.parseDouble(sc.nextLine());
                }
                Rectangle rect = new Rectangle(base, height);
                shapes[i] = rect;
            }
        }
        System.out.println(averageRectangleArea(shapes));

    }

}
