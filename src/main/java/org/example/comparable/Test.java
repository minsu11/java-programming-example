package org.example.comparable;

public class Test implements Comparable<Test> {
    private  int data;
    private String name;
    public Test(int data, String name) {
        this.data = data;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getData() {
        return data;
    }
    public String toString(){
        return "name: "+getName()+", data: "+getData();
    }

    @Override
    public int compareTo(Test o) {
        return this.getData() - o.getData();
    }
}
