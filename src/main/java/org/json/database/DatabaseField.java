package org.json.database;

public enum DatabaseField {
    USER("user"),
    ITEM("item"),
    RECORD("record");

    private String value;
    DatabaseField(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
