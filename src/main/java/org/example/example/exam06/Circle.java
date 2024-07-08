package org.example.example.exam06;

/**
 * packageName    : org.example.exam.exam06
 * fileName       : Circle
 * author         : parkminsu
 * date           : 2024. 6. 14.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024. 6. 14.        parkminsu       최초 생성
 */
public class Circle extends Shape implements Shape2D{
    private double radius;
    private double area;
    public Circle(double radius) {
        checkNegative(radius);
        this.radius = radius;
        this.area = Math.pow(radius,2) * Math.PI;
    }
    private void checkNegative(double radius){
        if(radius < 0){
            throw new IllegalArgumentException("Circle radius can't be negative");
        }
    }

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public void draw() {
        System.out.printf(toString());
    }

    @Override
    public String toString() {
        return "Circle";
    }
}
