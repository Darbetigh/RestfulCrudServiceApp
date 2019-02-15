package com.example.restfulcrud.domain;

public class Student {

    private int id;
    private String name;
    private String surname;
    private String field;

    public Student() {
        super();
    }

    public Student(int id, String name, String surname, String field) {
        super();
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.field = field;
    }

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
