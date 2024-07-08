package org.example.example.exam06;

/**
 * packageName    : org.example.exam.exam06
 * fileName       : Ball
 * author         : parkminsu
 * date           : 2024. 6. 14.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024. 6. 14.        parkminsu       최초 생성
 */
public class Ball extends Shape implements Shape3D{
    private double radius;
    private double volume;
    public Ball(double radius) {
        precondition(radius);
        this.radius = radius;
        this.volume = (double) 4 / 3 * Math.PI * Math.pow(radius, 3);
    }

    public void precondition(double radius){
        if(radius < 0){
            throw new IllegalArgumentException("radius can't be negative");
        }
    }

    @Override
    public double getVolume() {
        return this.volume;
    }

    @Override
    public void build() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Ball";
    }
}
