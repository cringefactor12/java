import java.util.Scanner;

public class inheritance {
    static class Shape {
        String color;
        boolean filled;
        Shape(){
        color="green";
        filled=true;
    }
    Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString() {
        return "A Shape with color of "+color+" and "+(filled?"":"not ")+"filled";
    }


    }
    static class Circle extends Shape {
        double radius;
        Circle(){
            this.radius=1.0;
        }
        Circle(double radius){
            this.radius=radius;
        }
        Circle(double radius, String color, boolean filled){
            this.radius=radius;
            this.color=color;
            this.filled=filled;
        }
        public double getRadius() {
            return radius;
        }
        public void setRadius(double radius) {
            this.radius = radius;
        }
        @Override
        public String toString() {
            return "A Circle with radius="+ radius +" which is a subclass of "+super.toString();
        }
        public double getArea(){
            return 3.14159265359*radius*radius;
        }
        public double getPerimeter(){
            return 2*3.14159265359*radius;
        }

    }
    static class Rectangle extends Shape {
        double width, length;
        Rectangle(){
            this.width=1.0;
            this.length=1.0;
        }
        Rectangle(double length, double width){
            this.width=width;
            this.length=length;
        }
        Rectangle(double length, double width, String color,
        boolean filled){
            this.width=width;
            this.length=length;
            this.color=color;
            this.filled=filled;
        }

        public double getWidth() {
            return width;
        }
        public void setWidth(double width) {
            this.width = width;
        }
        public double getLength() {
            return length;
        }
        public void setLength(double length) {
            this.length = length;
        }
        @Override
        public String toString() {
            return "A Rectangle with length=" + length +" and width=" + width + " which is a subclass of"+super.toString();
        }

        public double getArea() {
            return width*length;
        }
        public double getPerimeter() {
            return 2*(length+width);
        }

    }
    static class Square extends Rectangle {
        Square(){
            super();
        }
        Square(double side) {
            super(side,side);
        }
        Square(double side, String color, boolean filled){
            super(side,side,color,filled);
        }
    }
}
