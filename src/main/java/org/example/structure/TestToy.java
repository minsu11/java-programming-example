package org.example.structure;

public class TestToy extends Toy{

    public TestToy(String str){
        super(str);
    }


    @Override
    public void move() {
        System.out.println("test 객체 move");
    }
}
