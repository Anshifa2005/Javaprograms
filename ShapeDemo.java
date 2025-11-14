
abstract class Shape {
    abstract double area(); // abstract method to calculate area
}


abstract class TwoDim extends Shape {
   
}


abstract class ThreeDim extends Shape {
    
}


class Square extends TwoDim {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    
    double area() {
        return side * side;
    }
}


class Triangle extends TwoDim {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    
    double area() {
        return 0.5 * base * height;
    }
}


class Sphere extends ThreeDim {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    
    double area() {
        
        return 4 * Math.PI * radius * radius;
    }
}


class Cube extends ThreeDim {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    
    double area() {
        return 6 * side * side;
    }
}


public class ShapeDemo {
    public static void main(String[] args) {
        
        Square square = new Square(5);
        Triangle triangle = new Triangle(10, 6);
        Sphere sphere = new Sphere(3);
        Cube cube = new Cube(4);

        System.out.println("Area of Square: " + square.area());
        System.out.println("Area of Triangle: " + triangle.area());
        System.out.println("Surface Area of Sphere: " + sphere.area());
        System.out.println("Surface Area of Cube: " + cube.area());
    }
}
