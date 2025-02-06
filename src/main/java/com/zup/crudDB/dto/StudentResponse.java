package com.zup.crudDB.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StudentResponse {
    private Long id;
    @JsonProperty("nome")
    private String name;
    @JsonProperty("idade")
    private int age;

    public StudentResponse(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
