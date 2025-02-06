package com.zup.crudDB.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StudentRequest {
    @JsonProperty("nome")
    private String name;
    @JsonProperty("idade")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
