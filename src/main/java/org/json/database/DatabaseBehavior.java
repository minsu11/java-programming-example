package org.json.database;

public enum DatabaseBehavior {
    ADD("add"),
    DEL("del"),
    MOD("mod"),
    LIST("list");
    private String behaviorName;
    DatabaseBehavior(String behaviorName){
        this.behaviorName = behaviorName;
    }

    public String getBehaviorName(){
        return behaviorName;
    }
}
