package org.example.structure;
public class QueueMain {
    public static void main(String[] args) {
        Toy toy = new TestToy("test");
        Movable mv = new TestToy("movable toy");
        toy.move();
        toy.test();

        mv.move();

    }
}
