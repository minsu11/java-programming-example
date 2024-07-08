package org.example.example.exam06;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * packageName    : org.example.exam.exam06
 * fileName       : Shape
 * author         : parkminsu
 * date           : 2024. 6. 14.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024. 6. 14.        parkminsu       최초 생성
 */
public class Shape {
    public Shape(){
    }

    public static String toString(Shape[] shapes) {
        StringBuilder str = new StringBuilder();
        str.append("Shapes : [");
        int length = 0;
        for (Shape shape : shapes) {
            Class clazz = shape.getClass();
            if(length+1 == shapes.length){
                str.append(clazz.getSimpleName());
            }
            else{
                str.append(clazz.getSimpleName()).append(" ");
                length+=1;
            }
        }
        str.append("]");
        return str.toString();
    }

    public static Object[] getShape3DArray(Shape[] shapes){
        if(Objects.isNull(shapes)){
            throw new IllegalArgumentException("Shapes cannot be null");
        }

        List<Object> list = new ArrayList<>();
        for(Shape shape : shapes){
            if(shape instanceof Shape3D){
                list.add(shape);
            }
        }
        return list.toArray();

    }
    public static String printShape(String shapeType, Object[] objects){
        StringBuilder str = new StringBuilder();
        str.append(shapeType).append(" 도형은 [");
        int length = 0;
        for (Object o : objects) {
            if(length+1 == objects.length){

                str.append(o.toString()).append("]");
            }
            else{
                str.append(o.toString()).append(" ");
                length+=1;
            }
        }
        str.append("이며, 넓이는 [");
        length = 0;
        for (Object shape : objects) {
            if(shape instanceof Shape3D && length+1 == objects.length){
                str.append(((Shape3D) shape).getVolume()+"] ");
            }else{
                length+=1;
                str.append(((Shape3D) shape).getVolume()+" ");
            }
        }
        str.append("입니다.");
        return str.toString();
    }
}
