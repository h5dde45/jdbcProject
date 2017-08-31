package com.jdbc;

public class Subjects {

    private int id;
    private String name;

    public Subjects() {
    }

    public Subjects(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
