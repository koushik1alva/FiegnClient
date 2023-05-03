package com.microservice.DTO;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "Adhar")
public class Adhar {
    @Id
    private int id;
    private String name;
    private int aNo;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getaNo() {
        return aNo;
    }
    public void setaNo(int aNo) {
        this.aNo = aNo;
    }
}
