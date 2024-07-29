package org.json.database;

/**
 * Item 요소
 */
public class Item {
    private String id;
    private String model;
    private int hp;
    private int attack;
    private int defense;
    private int speed;
    private int attackSpeed;

    public Item(String id, String model,int hp,int attack,int defense, int speed, int attackSpeed) {
        this.id = id;
        this.model = model;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.attackSpeed = attackSpeed;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getAttack(){
        return attack;
    }
    public void setAttack(int attack){
        this.attack = attack;
    }
    public int getDefense(){
        return defense;
    }
    public void setDefense(int defense){
        this.defense = defense;
    }
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getAttackSpeed(){
        return attackSpeed;
    }
    public void setAttackSpeed(int attackSpeed){
        this.attackSpeed = attackSpeed;
    }
}
