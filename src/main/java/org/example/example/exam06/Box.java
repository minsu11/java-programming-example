package org.example.example.exam06;

/**
 * packageName    : org.example.exam.exam06
 * fileName       : Box
 * author         : parkminsu
 * date           : 2024. 6. 14.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024. 6. 14.        parkminsu       최초 생성
 */
public class Box extends Shape implements Shape3D{
    private double width;
    private double height;
    private double depth;
    private double volume;

    public Box(double width, double height, double depth) {
        precondition(width, height, depth);
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.volume = width * height * depth;

    }

    private void precondition(double width, double height, double depth) {
        if (width <= 0 || height <= 0 || depth <= 0) {
            throw new IllegalArgumentException("width and height and depth must be greater than 0");
        }
    }
    @Override
    public double getVolume() {
        return this.volume;
    }

    @Override
    public void build() {
        System.out.printf(toString());
    }

    @Override
    public String toString() {
        return "Box";
    }
}
