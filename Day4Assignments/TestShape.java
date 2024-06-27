package com.hcltech.Assig4;

import java.util.Random;

public class TestShape {
	    public static void main(String[] args) {
	        // Create an array of Shape references of size 10
	        Shape[] shapes = new Shape[10];

	        // Create a random object to generate random integers
	        Random random = new Random();

	        // Generate random shapes
	        for (int i = 0; i < shapes.length; i++) {
	            int shapeType = random.nextInt(4); // Random integer in the range 0 to 3
	            switch (shapeType) {
	                case 0:
	                    shapes[i] = new Line(random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100));
	                    break;
	                case 1:
	                    shapes[i] = new Circle(random.nextInt(100), random.nextInt(100), random.nextInt(50));
	                    break;
	                case 2:
	                    shapes[i] = new Rectangle(random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100));
	                    break;
	                case 3:
	                    PolyLine polyline = new PolyLine(random.nextInt(100), random.nextInt(100));
	                    int numPoints = random.nextInt(5) + 1; // Random number of points between 1 and 5
	                    for (int j = 0; j < numPoints; j++) {
	                        polyline.addPoint(random.nextInt(100), random.nextInt(100));
	                    }
	                    shapes[i] = polyline;
	                    break;
	            }
	        }

	        // Show each shape
	        for (Shape shape : shapes) {
	            shape.show();
	        }
	    }
	}



