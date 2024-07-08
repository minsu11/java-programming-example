package org.example.example.exam05;

/**
 * packageName    : org.example.exam.exam05
 * fileName       : Student
 * author         : parkminsu
 * date           : 2024. 6. 14.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024. 6. 14.        parkminsu       최초 생성
 */
public class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student( String name,int id) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Student o) {
      return this.id - o.id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
