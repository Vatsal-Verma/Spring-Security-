package com.SpringSec.SpringSecEx.Controller;

import lombok.Data;

@Data
public class Student {
    private int id;
    private String name;
    private int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString(){
        return id + name + marks;
    }
}
