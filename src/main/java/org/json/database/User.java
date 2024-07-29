package org.json.database;

import java.time.LocalDateTime;

public class User {
    private String id;
    private String nickname;
    private Item item;
    private java.lang.Record record;
    private LocalDateTime modifyDateTime;
    public User(String id, String nickname) {
        this.id = id;
        this.nickname = nickname;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public Item getItem() {
        return item;
    }
    public void setItem(Item item) {
        this.item = item;
    }
    public java.lang.Record getRecord() {
        return record;
    }
    public void setRecord(java.lang.Record record) {
        this.record = record;
    }
    public LocalDateTime getModifyDateTime() {
        return modifyDateTime;
    }
    public void setModifyDateTime(LocalDateTime modifyDateTime) {
        this.modifyDateTime = modifyDateTime;
    }
}
