package com.hcltech.Assig4;

import java.util.ArrayList;
import java.util.Random;

// Define the abstract base class Shape
abstract class Shape {
    protected int x, y;

    // Constructor to initialize x and y
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to move the shape
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    // Abstract method to show the shape
    public abstract void show();

    // Abstract method to return string representation of the shape
    public abstract String toString();
}

// Subclass Line extending Shape
class Line extends Shape {
    private int x2, y2;

    // Constructor to initialize a line
    public Line(int x, int y, int x2, int y2) {
        super(x, y);
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void show() {
        System.out.println("Line: " + this);
    }

    @Override
    public String toString() {
        return "Start=(" + x + "," + y + "), End=(" + x2 + "," + y2 + ")";
    }
}

// Subclass Circle extending Shape
class Circle extends Shape {
    private int radius;

    // Constructor to initialize a circle
    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void show() {
        System.out.println("Circle: " + this);
    }

    @Override
    public String toString() {
        return "Center=(" + x + "," + y + "), Radius=" + radius;
    }
}

// Subclass Rectangle extending Shape
class Rectangle extends Shape {
    private int x2, y2;

    // Constructor to initialize a rectangle
    public Rectangle(int x, int y, int x2, int y2) {
        super(x, y);
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void show() {
        System.out.println("Rectangle: " + this);
    }

    @Override
    public String toString() {
        return "Corner1=(" + x + "," + y + "), Corner2=(" + x2 + "," + y2 + ")";
    }
}

// Subclass PolyLine extending Shape
class PolyLine extends Shape {
    private ArrayList<int[]> points;

    // Constructor to initialize a polyline
    public PolyLine(int x, int y) {
        super(x, y);
        points = new ArrayList<>();
        points.add(new int[]{x, y});
    }

    // Add point to the polyline
    public void addPoint(int x, int y) {
        points.add(new int[]{x, y});
    }

    @Override
    public void show() {
        System.out.println("PolyLine: " + this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] point : points) {
            sb.append("(").append(point[0]).append(",").append(point[1]).append(") ");
        }
        return sb.toString();
    }
}
