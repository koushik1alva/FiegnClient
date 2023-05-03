package com.microservice.DTO;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "Person")
public class Person {
    @Id
    private int id;
    private String name;
    private int aid;
    public synchronized int getId() {
        return id;
    }
    public synchronized void setId(int id) {
        this.id = id;
    }
    public synchronized String getName() {
        return name;
    }
    public synchronized void setName(String name) {
        this.name = name;
    }
    public synchronized int getAid() {
        return aid;
    }
    public synchronized void setAid(int aid) {
        this.aid = aid;
    }
}
