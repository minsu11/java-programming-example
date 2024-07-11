package org.example.structure;

public abstract class Toy implements Movable{
    String name;

    public Toy(String name) {
        this.name = name;
    }

    public void test(){
        System.out.println("abstract test");
    }

}
