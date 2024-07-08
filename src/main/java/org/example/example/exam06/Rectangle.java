package org.example.example.exam06;

/**
 * packageName    : org.example.exam.exam06
 * fileName       : Rectangle
 * author         : parkminsu
 * date           : 2024. 6. 14.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024. 6. 14.        parkminsu       최초 생성
 */
public class Rectangle extends Shape implements Shape2D{
    private double weight;
    private double height;
    private double area;

    public Rectangle(double weight, double height) {
        precondition(weight, height);
        this.weight = weight;
        this.height = height;
        this.area = weight * height;

    }

    public void precondition(double width, double height) {
        if(width < 0 || height < 0) {
            throw new IllegalArgumentException("weight and height must be greater than 0");
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
        return "Rectangle";
    }
}
