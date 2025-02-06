package com.zup.crudDB.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StudentRequest {
    @JsonProperty("nome")
    private String name;
    @JsonProperty("idade")
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
