package org.example.designpattern.protopattern;

public class DataBean implements ProtoType{

    private int no;
    private String name;

    public DataBean(int no, String name){
        this.no = no;
        this.name = name;
    }
    public int getNo(){
        return no;
    }
    public void setNo(int no){
        this.no = no;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    @Override
    public DataBean clone(){
        return new DataBean(this.no, this.name);
    }
}
